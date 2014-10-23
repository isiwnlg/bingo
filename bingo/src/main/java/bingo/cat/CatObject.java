package bingo.cat;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.asp.ASPBlock;
import bingo.cat.vo.Association;
import bingo.cat.vo.CatClass;
import bingo.cat.vo.ClassAttribute;

public class CatObject implements CatConstants{
   private static final Logger logger = LoggerFactory.getLogger(CatObject.class);
   
   
   public CatObject(CatObject parentObject){
      this.parentObject = parentObject;
   }
   public ObjectType objectType;
   public String quid;
   public String[] constructorArgList = null;
   public final LinkedHashMap<String, Object> attributeMap = new LinkedHashMap<String, Object>();
   
   ArrayList<String> lines ;
   
   public CatObject parentObject = null;
   
   
   public final int[] startRowCol = {-1,-1};
   public final int[] endRowCol = {-1,-1};
   
   public String catFile = null;
   public String catFileLines = null;
   
   
   public static final HashMap<String, CatObject> register = new HashMap<String, CatObject>();
   public static final HashMap<String, CatObject> classCategoryRegister = new HashMap<String, CatObject>();
   
   
   public static final ArrayList<String> catFileList = new ArrayList<String>();
   
   static{
      catFileList.add("C:/Users/lu/Desktop/temp/appsrv.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/chgmng.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/constr.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/docctl.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/docman.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/doctrs.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/enterp.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/Fndbas.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/genbas.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/genmng.cat");
//      catFileList.add("C:/Users/lu/Desktop/temp/goldgrig.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/hzwflo.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/mpccom.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/quamng.cat");
      catFileList.add("C:/Users/lu/Desktop/temp/safety.cat");
   }
   
   
   public static void init() throws IOException{
      for (Iterator<String> iterator = catFileList.iterator(); iterator.hasNext();) {
         String filePath = iterator.next();
         File file = new File(filePath);
         ArrayList<String> lines = (ArrayList<String>) FileUtils.readLines(file, "UTF-8");
         logger.info("+++++++processing file: {}",file);
         for(int lineNo = 0; lineNo<lines.size(); ){
            logger.debug("--------{}",lineNo);
            String line = lines.get(lineNo);
            if(StringUtils.isEmpty(line)){
               lineNo++;
               continue;
            }else if(CatObject.isObject(line)){
               int[] endPos = CatObject.getObjectEndPos(lines,lineNo);
               CatObject object = new CatObject(null);
               lineNo = object.buildObject(lines, lineNo, endPos[0]);
               
               if(object.objectType != null && object.objectType.compareTo(ObjectType.Class_Category) == 0){
                  classCategoryRegister.put(object.quid, object);
               }
               
               logger.info("+++++++object {} is created.",object);
            }else{
               lineNo++;
               logger.error("ERROR: LineNo {}: I DO NOT KNOW WHAT TO DO NOW!", lineNo);
            }
         }
      }
   }
   
   public void setAttr(String paraName, String paraValue){
      attributeMap.put(paraName, paraValue);
   }
   
   public void setAttr(String paraName, boolean paraValue){
      attributeMap.put(paraName, paraValue);
   }
   
   public void setAttr(String paraName, CatObject paraValue){
      attributeMap.put(paraName, paraValue);
   }
   public static void main(String[] args) throws IOException {
//      init();
////      getDesignNavigator();
//      String quid = "53BEE82A03C7";
//      ArrayList<Association> associationList = getClassAssociationList(quid);
//      
//      for (Iterator<Association> iterator = associationList.iterator(); iterator.hasNext();) {
//         Association association = (Association) iterator.next();
//         
//         association.getRoleA().getSupplier();
//         association.getRoleA().getName();
//         association.isPrimaryKey();
//         association.isMandatory();
//         association.isInsertable();
//         association.isLov();
//         association.isUpdatable();
//         
//      }
//      System.out.println(FieldType.valueOf("STRING"));
      
      String str = "quaBsCheckForm";
      
      char[] charArray = str.toCharArray();
      
      ArrayList<String> tempList= new ArrayList<String>();
      StringBuilder sb = new StringBuilder();
      char tempChar;
      for (int i = 0; i < charArray.length; i++) {
         tempChar = charArray[i];
         if(tempChar<= 'z' && tempChar >= 'a'){
            sb.append(tempChar);
         }else if(tempChar<= 'Z' && tempChar >= 'A'){
            tempList.add(sb.toString());
            sb = new StringBuilder();
            sb.append(tempChar);
         }else{
            throw new RuntimeException("ERROR: Invalid Class Name.");
         }
      }
      if(StringUtils.isNotEmpty(sb.toString())){
         tempList.add(sb.toString());
      }
      
   }
   
   /**
    * 给出list的那一行，计算该list下面有几个直接对象
    * @param lines
    * @param lineNo
    * @return 直接对象的开始行号和结束行号对组成的列表{[obj1开始行号,obj1结束行号],[obj2开始行号,obj2结束行号]}
    */
   public static ArrayList<int[]> listObjCount( ArrayList<String> lines, int lineNo){
      int tempLineNo = lineNo;
      ArrayList<int[]> retList = new ArrayList<int[]>();
      String tempLine = lines.get(tempLineNo);
      if(!isList(getAttrValue(tempLine))){
         throw new RuntimeException("Holy shit. This is not a list line. LineNo：" + lineNo);
      }
      
      int fromLineNo = 0;
      int toLineNo = 0;
      Stack<Character> stack = new Stack<Character>();
      for (; tempLineNo < lines.size(); tempLineNo++) {
         if(lineNo == tempLineNo){
            tempLine = lines.get(tempLineNo);
            int beginIndex = tempLine.indexOf("(list");
            tempLine = tempLine.substring(beginIndex);
         }else{
            tempLine = lines.get(tempLineNo);
         }
         if(!StringUtils.isEmpty(tempLine)){
            char[] charArray = tempLine.toCharArray();
            for (int i = 0; i < charArray.length;) {
               Character temp = charArray[i];
               
               if(i==0 && temp.equals('|')){//TODO LQW
                  logger.debug("| appeared in line: {}", tempLineNo);
                  break;
               }
               
               i++;
               if(temp.equals(CHAR_LEFT_BRACKET)){
                  stack.push(temp);
                  if(stack.size() == 2){
                     fromLineNo = tempLineNo;
                  }
               }else if(temp.equals(CHAR_RIGHT_BRACKET)){
                  stack.pop();
                  if(stack.size() == 1){
                     toLineNo = tempLineNo;
//                     System.out.println("from:" + (fromLineNo+1) + " -> " + (toLineNo+1));
                     retList.add(new int[]{fromLineNo, toLineNo});
                  }else if(stack.size() == 0){
                     return retList;
                  }else{
                     //no-op
                  }
               }else if (temp.equals(CHAR_QUOTE)){
                  //遇到引号一直读到关闭的引号为止，这样引号内的括号就作为字符串的一部分了
                  temp = charArray[i];
                  i++;
                  while(!temp.equals(CHAR_QUOTE)){
                     temp = charArray[i];
                     i++;
                  }
               }
            }
         }
      }
      return retList;
   }
   
   /**
    * 
    * @param paraName
    * @param lines
    * @param lineNo
    * @return 返回处理完成的最后一行的行号
    */
   public int setListAttr(String paraName, ArrayList<String> lines, int lineNo){
      
      CatObjectList catObjectList = new CatObjectList();
      
      attributeMap.put(paraName, catObjectList);
      int tempLineNo = lineNo;
      String tempLine = lines.get(tempLineNo);// first line
      if(!isList(getAttrValue(tempLine))){
         throw new RuntimeException("Holy shit. This is not a list line. LineNo：" + lineNo);
      }
      
      catObjectList.setType(getListType(tempLine));
      
      ArrayList<int[]> objIndexList = listObjCount(lines, lineNo);
      int[] tempIndex = null;
      for (int i = 0; i < objIndexList.size(); i++) {
         tempIndex = objIndexList.get(i);
         
         if(catObjectList.getType().name().equals("Points")){
            //no-OP
         }else{
            CatObject catObject = new CatObject(this);
            catObject.buildObject(lines, tempIndex[0], tempIndex[1]);
            catObjectList.add(catObject);
            register.put(catObject.quid, catObject);
         }
      }
      
      int endLineNo = lineNo;
      int endColNo = -1;
      if( objIndexList.size() > 0){
         //TODO 这个地方不太精确，假设最后一个对象后面紧跟着的那个字符就是(list 对饮的结束的)
         endLineNo = objIndexList.get(objIndexList.size()-1)[1];
      }
      
      
      
      
      return endLineNo;
   }
   public void setObjectAttr(String paraName, CatObject object){
      attributeMap.put(paraName, object);
   }
   
   
   /**
    * 返回结束的行号和列号
    * TODO BUG: 没有引号里面有括号的情况
    * @param lines cat文件的内容
    * @param lineNo object开始的行号
    * @return
    */
   public static int[] getObjectEndPos( ArrayList<String> lines, int lineNo){
      int[] ret = new int[2];
      int tempLineNo = lineNo;
      
      String tempLine = lines.get(tempLineNo);// first line
      Stack<Character> stack = new Stack<Character>();
      
      if(tempLine.indexOf("(object")==-1){
         throw new RuntimeException("Holy shit. This is not an object line. LineNo：" + lineNo);
      }else{
         stack.add('(');
      }
      
      for (tempLineNo++; tempLineNo < lines.size(); tempLineNo++) {
         tempLine = lines.get(tempLineNo);
         if(!StringUtils.isEmpty(tempLine)){
            char[] charArray = tempLine.toCharArray();
            for (int i = 0; i < charArray.length;i++) {
               Character temp = charArray[i];
               if(i==0 && temp.equals('|')){//TODO LQW |||||||||
                  logger.debug("| appeared in line: {}", tempLineNo);
                  break;
               }
               if(temp.equals(CHAR_LEFT_BRACKET)){
                  stack.push(temp);
               }else if(temp.equals(CHAR_RIGHT_BRACKET)){
                  stack.pop();
                  if(stack.size() == 0){
                     ret[0] = tempLineNo;
                     ret[1] = i;
                     logger.debug("{} : {}",ret[0],ret[1]);
                     return ret;
                  }
               }else if (temp.equals(CHAR_QUOTE)){
                  //遇到引号一直读到关闭的引号为止，这样引号内的括号就作为字符串的一部分了
                  i++;
                  temp = charArray[i];
                  while(!temp.equals(CHAR_QUOTE)){
                     i++;
                     temp = charArray[i];
                  }
               }
            }
         }
      }
      return ret;
   }
   
   
   
   
   /**
    * 构建对象，并返回下一行要处理的行号，注意是下一行
    * 当前行号
    * @param lines
    * @param fromLineNo
    * @param toLineNo
    * @return
    */
   public int  buildObject(ArrayList<String> lines, int fromLineNo, int toLineNo){
      this.lines = lines;
      int currLineNo = fromLineNo;
      String currLineTemp = lines.get(currLineNo);
      int startPos = currLineTemp.indexOf("(object");
      String currLine = currLineTemp.substring(startPos);
      if(!isObject(currLine)){
         throw new RuntimeException("Holy shit. This is not a object line. LineNo：" + fromLineNo);
      }
      
      startRowCol[0] = fromLineNo;
      endRowCol[0] = toLineNo;
      
      
      logger.debug("--------{}",currLineNo);
      constructorArgList = getObjectPara(currLine);
      objectType = getObjectType(currLine);
      
      for (currLineNo++; currLineNo <= toLineNo; currLineNo++) {
         logger.debug("--------{}",currLineNo);
         currLine = lines.get(currLineNo);
         if(StringUtils.isEmpty(currLine)){
            continue;
         }else if(isObject(currLine)){
            CatObject obj = new CatObject(this);
            logger.debug("build object {}'s subObject.",obj);
            currLineNo = obj.buildObject(lines, currLineNo, lines.size()-1);
         }else if(isAttr(currLine)){
            String attrName = getAttrName(currLine);
            String attrValue = getAttrValue(currLine);
            if(isBoolean(attrValue)){
               setAttr(attrName, attrValue.startsWith("TRUE"));
            }else if(isString(attrValue)){
               int beginIndex = attrValue.indexOf('"');
               int endIndex = attrValue.indexOf('"', beginIndex+1);
               setAttr(attrName, attrValue.substring(beginIndex+1, endIndex));
               if("quid".equals(attrName)){
                  quid = attrValue.substring(beginIndex+1, endIndex);
                  register.put(quid, this);
               }
            }else if(isList(attrValue)){
               //需要考虑什么时候结束对象的解析
               currLineNo = setListAttr(attrName, lines, currLineNo);
            }else if(isObject(attrValue)){
               //需要考虑什么时候结束对象的解析
               int[] pos = getObjectEndPos(lines, currLineNo);
               CatObject obj = new CatObject(this);
               setObjectAttr(attrName,obj);
               int retValue = obj.buildObject(lines, currLineNo, pos[0]);
               currLineNo = pos[0];//不用buildObject返回的值作为当前行
            }else{
               int endIndex = attrValue.indexOf(CHAR_RIGHT_BRACKET);
               endIndex = endIndex == -1 ? attrValue.length() : endIndex;
               setAttr(attrName, attrValue.substring(0, endIndex));//TODO 这个地方还有点问题，不能当字符串处理
            }
         }else{
            logger.error("ERROR: LineNo {}: I DO NOT KNOW WHAT TO DO NOW!", currLineNo);
         }
      }
      return currLineNo;
   }
   
   // static method
   public static boolean isAttr(String line){
      return !isObject(line);
   }
   
   public static String getAttrName(String line){
      String tLine = StringUtils.trim(line);
      String[] tempArray = tLine.split(" ");
      return tempArray.length >0 ? tempArray[0] : "";
   }
   
   public static String getAttrValue(String line){
      String tLine = StringUtils.trim(line);
      String attrName = getAttrName(line);
      String tempString = tLine.substring(attrName.length());
      return StringUtils.trim(tempString);
   }
   
   public static boolean isBoolean(String attrValue){
      return attrValue.startsWith("TRUE") || attrValue.startsWith("FALSE");
   }
   public static boolean isString(String attrValue){
      return attrValue.startsWith("\"");
   }
   public static boolean isList(String attrValue){
      return attrValue.startsWith("(list");
   }
   public static boolean isNum(String attrValue){
      return attrValue.startsWith("(list");//TODO XXXAS
   }
   
   private ObjectType getObjectType(String line){
      String tLine = StringUtils.trim(line);
      String[] tempArray = tLine.split(" ");
      if( tempArray.length < 2 ){
         logger.debug("cannot determine the object type: {}",line);
      }
      String type = tempArray[1];
      
      ObjectType[] types = ObjectType.values();
      ObjectType tempObjectType = null;
      for (int i = 0; i < types.length; i++) {
         tempObjectType = types[i];
         if(tempObjectType.name().equals(type)){
            return tempObjectType;
         }
      }
      
      logger.info("object type missing: {}",type);
      return null;
   }
   
   public ListType getListType(String line){
      int startPos = line.indexOf(CAT_LIST);
      String cleanLine = line.substring(startPos);
      String[] tempArray = cleanLine.split(" ");
      if( tempArray.length < 2 ){
         logger.debug("cannot determine the list type: {}",line);
      }
      
      
      String type = tempArray[1];
      
      if(type.indexOf(')') > 0 ){
         type = type.substring(0,type.indexOf(')'));
      }
      
      
      return ListType.valueOf(type);
   }
   
   
   public String toString(){
      return objectType + " : " + ArrayUtils.toString(constructorArgList);
   }
   
   /**
    * TODO 还要考虑引号以及引号里面有空格这种情况
    * 对象的参数仅仅考虑字符串，非字符串舍弃 例如@1
    * @param line
    * @return
    */
   public static String[] getObjectPara(String line){
      String tLine = StringUtils.trim(line);
      
      List<String> paraList = new ArrayList<String>();
      
      int beginIndex = tLine.indexOf(CHAR_QUOTE);
      int endIndex  = -1;
      if(beginIndex == -1){
         return ArrayUtils.EMPTY_STRING_ARRAY;
      }else{
         endIndex = tLine.indexOf(CHAR_QUOTE, beginIndex+1);
         while(true){
            if(endIndex == -1){
               throw new RuntimeException("object para does not have end quote.");
            }
            paraList.add(tLine.substring(beginIndex+1, endIndex));
            beginIndex = tLine.indexOf(CHAR_QUOTE,endIndex+1);
            if(beginIndex == -1){
               break;
            }else{
               endIndex = tLine.indexOf(CHAR_QUOTE,beginIndex+1);
            }
         }
      }
      return paraList.toArray(new String[]{});
   }
   
   /**
    * 读取下一个单词，遇到空格返回
    * @param reader
    * @return
    * @throws IOException
    */
   public static String readNextWord(Reader reader) throws IOException{
      String ret = "";
      int tempChar = reader.read();
      Character temp = (char)tempChar; 
      while(tempChar>-1){
         if(temp.equals(CHAR_SPACE)){
            if(!ret.isEmpty()){
               break;
            }else{
               // read next character
            }
         }else if(temp.equals(CHAR_T)){
            if(!ret.isEmpty()){
               break;
            }else{
               // read next character
            }
         }else{
            ret += temp;
         }
         tempChar = reader.read();
         temp = (char)tempChar;
      }
      return ret;
   }
   
   
   
   public static boolean isObject(String line){
      String tLine = StringUtils.trim(line);
      return tLine.startsWith(CAT_OBJECT);
   }
   
   
   //-----
   
   public static String getDesignNavigator(){
      StringBuilder sb = new StringBuilder();
      Set<Entry<String, CatObject>>  classCategorySet = classCategoryRegister.entrySet();
      for (Iterator iterator = classCategorySet.iterator(); iterator.hasNext();) {
         Entry<String, CatObject> classCategoryEntry = (Entry<String, CatObject>) iterator.next();
         CatObject object = classCategoryEntry.getValue();
         
         
         LinkedHashMap<String, Object>  attributeMap = object.attributeMap;
         
         
//         System.out.println("{\"id\":\""+object.quid+"\", \"pId\":\"0\", \"name\":\""+object.constructorArgList[0]+"\"},");
         sb.append("{\"id\":\""+object.quid+"\", \"pId\":\"0\", \"name\":\""+object.constructorArgList[0]+"\"},").append("\n");
         ArrayList<CatObject> objList = object.getListAttr("logical_models");
         CatObject catObject = null;
         for (Iterator iterator2 = objList.iterator(); iterator2.hasNext();) {
            catObject = (CatObject) iterator2.next();
            if(catObject.objectType == null){
               System.out.println("   ");
               continue;
            }
            if(catObject.objectType.compareTo(ObjectType.Class)== 0 || catObject.objectType.compareTo(ObjectType.Instantiated_Class)== 0){
               sb.append("{\"id\":\""+catObject.quid+"\", \"pId\":\""+object.quid+"\", \"name\":\""+catObject.constructorArgList[0]+"\",").
               append(" \"url\":\"./DesignCenter.jsp?quid="+catObject.quid+"\",").
               append(" \"target\":\"DesignCenter\"").
               append("},\n");
            }
         }
      }

      String tempStr = sb.toString();
      int endPos = -1;
      if(tempStr != null && tempStr.endsWith(",\n")){
         endPos = tempStr.lastIndexOf(",\n");
         tempStr = tempStr.substring(0,endPos);
      }
      
      return tempStr;
   }
   
   
   public static CatClass getClass(String classQuid){
      setMoidifyClassAttribute("533C992D01BA");
      CatClass clazz = new CatClass();
      CatObject catObject = CatObject.register.get(classQuid);
      if(catObject.is(ObjectType.Class)){
         clazz.setName(catObject.getName());
         clazz.setQuid(catObject.quid);
         setClassNames(clazz.getName(), clazz);
         clazz.setClassAttributeList(getClassAttributeList(classQuid));
         clazz.setAssociationList(getClassAssociationList(classQuid));
      }else if(catObject.is(ObjectType.Instantiated_Class)){
         clazz.setName(catObject.getName());
         clazz.setQuid(catObject.quid);
         setClassNames(clazz.getName(), clazz);
         clazz.setViewName("");
         clazz.setTabName("");
      }else{
         throw new RuntimeException("ERROR: ");
      }
      return clazz;
   }
   
   
   public static ArrayList<ClassAttribute> getClassAttributeList(String classQuid){
      ArrayList<ClassAttribute> classAttributeList = new ArrayList<ClassAttribute>();
      
      ClassAttribute tempClassAttribute = null;
      CatObject catObject = CatObject.register.get(classQuid);
      if(catObject.is(ObjectType.Class)){
         ArrayList<CatObject> objList = catObject.getListAttr("class_attributes");
         if(objList != null){
            for (Iterator iterator = objList.iterator(); iterator.hasNext();) {
               CatObject classAttrObj = (CatObject) iterator.next();
               if(classAttrObj.is(ObjectType.ClassAttribute)){
                  tempClassAttribute = new ClassAttribute();
                  String quid = classAttrObj.quid;
//               Integer length=0;
                  String tempAttrName = classAttrObj.getName();
                  String prompt = tempAttrName;
                  String roseType = classAttrObj.getStrAttr("type");
//               FieldType fieldType = FieldType.STRING;
//               FieldFormat fieldFormat = null;
                  boolean primaryKey = true;
                  boolean mandatory = true;
                  boolean insertable = true;
                  boolean lov = true;
                  FieldUpdatable updatable = FieldUpdatable.NOTALLOWED;
                  
                  String fieldFormatStr = null;
                  String exportControl = classAttrObj.getStrAttr("exportControl");
                  ArrayList<CatObject> attrSet = classAttrObj.getListAttr("attributes");
                  if(null != attrSet && attrSet.size() >0){
                     for (Iterator<CatObject> iterator2 = attrSet.iterator(); iterator2.hasNext();) {
                        CatObject catObject2 = iterator2.next();
                        if(catObject2.is(ObjectType.Attribute)){
                           String tempName = catObject2.getStrAttr("name");
                           String tempValue = catObject2.getStrAttr("value");
                           if(tempName == null){
                              continue;
                           }
                           if("FieldFormat".equals(tempName)){
                              fieldFormatStr = tempValue;
                           }else if("FieldFlags".equals(tempName)){
                              if(null != tempValue && tempValue.length() == 5){
                                 primaryKey = tempValue.charAt(0) == 'K' || tempValue.charAt(0) == 'P';
                                 mandatory = tempValue.charAt(1) == 'M';
                                 insertable = tempValue.charAt(2) == 'I';
                                 lov = tempValue.charAt(4) == 'L';
                                 
                                 if(tempValue.charAt(3) == 'U'){
                                    updatable = FieldUpdatable.ALLOWED;
                                 }else if(tempValue.charAt(3) == 'C'){
                                    updatable = FieldUpdatable.ALLOWEDIFNULL; 
                                 }else if(tempValue.charAt(3) == '-'){
                                    updatable = FieldUpdatable.NOTALLOWED;
                                 }else{
                                    throw new RuntimeException("ERROR: Unknown update flag!");
                                 }
                              }
                           }
                        }
                     }
                  }
                  
                  //fall back to rosetype
                  if(StringUtils.isEmpty(fieldFormatStr)){
                     setRoseDataType(roseType, tempClassAttribute);
                  }else{
                     setDataType(fieldFormatStr, tempClassAttribute);
                  }
                  
                  tempClassAttribute.setName(tempAttrName);
                  tempClassAttribute.setPrompt(getDefaultPromptByCamelName(tempAttrName));
                  tempClassAttribute.setQuid(quid);
                  tempClassAttribute.setPrimaryKey(primaryKey);
                  tempClassAttribute.setMandatory(mandatory);
                  tempClassAttribute.setInsertable(insertable);
                  tempClassAttribute.setUpdatable(updatable);
                  tempClassAttribute.setLov(lov);
                  classAttributeList.add(tempClassAttribute);
               }
            }
         }
      }else{
         throw new RuntimeException("ERROR: ");
      }
      return classAttributeList;
   }
   
   
   public static ArrayList<Association> getClassAssociationList(String classQuid){
      ArrayList<Association> associationList = new ArrayList<Association>();
      CatObject classCatObject = CatObject.register.get(classQuid);
      CatObject classCategoryCatObject = classCatObject.parentObject;
      ArrayList<CatObject> tempList = null;
      Association tempAssociation = null;
      
      ArrayList<CatObject> objList = classCategoryCatObject.getListAttr("logical_models");
      CatObject tempCatObject = null;
      CatObject tempCatObject2 = null;
      for (Iterator<CatObject> iterator = objList.iterator(); iterator.hasNext();) {
         tempCatObject = iterator.next();
         if(tempCatObject.is(ObjectType.Association)){
            tempList = tempCatObject.getListAttr("roles");
            
            if(tempList != null && tempList.size() ==2){
               tempCatObject2 = tempList.get(1);
               String quidu = tempCatObject2.getStrAttr("quidu");
               if(quidu != null && quidu.equals(classQuid)){
                  tempAssociation = new Association();
                  tempAssociation.buildFromCatObject(tempCatObject);
                  associationList.add(tempAssociation);
               }
            }else{
               throw new RuntimeException("ERROR: Should not happen!");
            }
         }
      }
      return associationList;
   }
   
   //utility method
   public Object getObjAttr(String attrName){
      return attributeMap.get(attrName);
   }
   public CatObjectList getCatObjectList(String attrName){
      return (CatObjectList)attributeMap.get(attrName);
   }
   public ArrayList<CatObject> getListAttr(String attrName){
      CatObjectList temp = getCatObjectList(attrName);
      return temp == null ? null : temp.getCatObjectList();
   }
   public String getStrAttr(String attrName){
      return (String)attributeMap.get(attrName);
   }
   public boolean getBoolAttr(String attrName){
      if(attributeMap.get(attrName) == null){
         return false;
      }
      return (Boolean)attributeMap.get(attrName);
   }
   
   public String getName(){
      if(constructorArgList == null || constructorArgList.length == 0){
         return "";
      }
      return constructorArgList[0];
   }
   
   public boolean is(ObjectType objectType){
      if(objectType == null){
         throw new RuntimeException("ERROR: objectType can not be null.");
      }
      if(this.objectType == null){
         return false;
      }
      return this.objectType.compareTo(objectType) == 0;
   }
   
   //static utility
   //"STRING(120)/UPPERCASE",STRING(120),
   public static void setRoseDataType(String dataType, ClassAttribute attribute){
      String tempDataType = dataType;
      if(StringUtils.isNotEmpty(dataType)){//pre-process rose Type
         tempDataType = dataType.toUpperCase();
         RoseFieldType.valueOf(tempDataType);
         if("DATETIME".equals(tempDataType)){
            tempDataType = "DATE/DATETIME";
         }
      }
      setDataType(tempDataType, attribute);
   }
   public static void setDataType(String dataType, ClassAttribute attribute){
      FieldType fieldType = FieldType.STRING; 
      Integer length = 0; 
      FieldFormat fieldFormat = FieldFormat.UNFORMATTED;
      if(!StringUtils.isEmpty(dataType)){
         String[] parts = dataType.split("/");
         if(!ArrayUtils.isEmpty(parts)){
            String tempPart = parts[0];
            if(!StringUtils.isEmpty(tempPart)){
               int startPos = tempPart.indexOf('(');
               int endPos = -1;
               String cleanTypeStr;
               if(startPos == -1){
                  cleanTypeStr = tempPart;
               }else{
                  cleanTypeStr = tempPart.substring(0,startPos);
                  endPos = tempPart.indexOf(')');
                  if(endPos <= startPos ){
                     throw new RuntimeException("ERROR: File is ruined.");
                  }else{
                     length = new Integer(tempPart.substring(startPos+1, endPos));
                  }
               }
               fieldType = FieldType.valueOf(cleanTypeStr.toUpperCase());
            }else{
               //no-op
            }
            
            if(parts.length == 2){
               fieldFormat = FieldFormat.valueOf(parts[1]);
            }else if(parts.length >2){
               throw new RuntimeException("ERROR FIELD FORMAT :" + dataType);
            }
         }else{
            //no-op
         }
      }else{
         //no-op
      }
      
      attribute.setFieldType(fieldType);
      attribute.setLength(length);
      attribute.setFieldFormat(fieldFormat);
   }
   
   public static String getDefaultPromptByCamelName(String camelName){
      String[] strArray = extractCamelStr(camelName);
      StringBuilder prompt = new StringBuilder();
      for (int i = 0; i < strArray.length; i++) {
         prompt.append(strArray[i]).append(" ");
      }
      prompt.deleteCharAt(prompt.length()-1);
      return prompt.toString();
   }
   
   public static void setClassNames(String className, CatClass clazz){
      String[] strArray = extractCamelStr(className);
      StringBuilder viewName = new StringBuilder();
      for (int i = 0; i < strArray.length; i++) {
         viewName.append(strArray[i].toUpperCase()).append("_");
      }
      viewName.deleteCharAt(viewName.length()-1);
      StringBuilder packageName = new StringBuilder(viewName);
      packageName.append("_API");
      StringBuilder tableName = new StringBuilder(viewName);
      tableName.append("_TAB");
      
      clazz.setViewName(viewName.toString());
      clazz.setTabName(tableName.toString());
      clazz.setPackageName(packageName.toString());
   }
   
   public static String[] extractCamelStr(String str){
      char[] charArray = str.toCharArray();
      
      ArrayList<String> tempList= new ArrayList<String>();
      StringBuilder sb = new StringBuilder();
      char tempChar;
      for (int i = 0; i < charArray.length; i++) {
         tempChar = charArray[i];
         if(tempChar<= 'z' && tempChar >= 'a'){
            sb.append(tempChar);
         }else if(tempChar<= 'Z' && tempChar >= 'A'){
            if(sb.length() == 0){
               //no-op
            }else{
               tempList.add(sb.toString());
               sb = new StringBuilder();
            }
            sb.append(tempChar);
         }else{
            throw new RuntimeException("ERROR: Invalid Class Name.");
         }
      }
      if(StringUtils.isNotEmpty(sb.toString())){
         tempList.add(sb.toString());
      }
      return tempList.toArray(new String[0]);
   }
   
   public static FieldFormat getFieldFormat(String str){
      if(StringUtils.isEmpty(str)){
         return null;
      }
      String tempStr = str.toUpperCase();
      FieldFormat[] fieldFormats = FieldFormat.values();
      FieldFormat tempFieldFormats;
      for (int i = 0; i < fieldFormats.length; i++) {
         tempFieldFormats = fieldFormats[i];
         if(tempFieldFormats.name().equals(tempStr)){
            return tempFieldFormats;
         }
      }
      throw new RuntimeException("ERROR: Unknown format.");
   }
   
   
   //update file
   public static void setMoidifyClassAttribute(String quid){
      
      String attrQuid = quid;
      CatObject catObject = CatObject.register.get(attrQuid);
      ArrayList<String> lines = catObject.lines;
      int[] startPos = null;
      int[] endPos = null;
      if(catObject.is(ObjectType.ClassAttribute)){
         startPos = catObject.startRowCol;
         endPos = catObject.endRowCol;
         for (int i = startPos[0]; i <= endPos[0]; i++) {
            System.out.println(lines.get(i));
         }
      }else{
         throw new RuntimeException("ERROR:");
      }
   }
   
   /**
    * 
    * @return
    */
   public ArrayList<CatFileLine> convertLines(){
      if(this.lines == null){
         return null;
      }
      ArrayList<CatFileLine> retList = new ArrayList<CatFileLine>();
      String tempLine = null;
      for (Iterator iterator = this.lines.iterator(); iterator.hasNext();) {
         tempLine = (String) iterator.next();
         retList.add(new CatFileLine(tempLine));
      }
      return retList;
   }
   
   
   public void outputCatFile(ArrayList<CatFileLine> catFile){
      for (Iterator iterator = catFile.iterator(); iterator.hasNext();) {
         CatFileLine catFileLine = (CatFileLine) iterator.next();
         if(catFileLine.isUnchanged()){
            System.out.println(catFileLine.getLine());
         }else if(catFileLine.isModified()){
            System.out.println(catFileLine.getNewLine());
         }else if(catFileLine.isObsoleted()){
            continue;
         }
      }
   }
   
   public static String quoteStr(String str){
      return "\"" + str + "\"";
   }
   public static String join(char[] chars, String separator){
      if(chars == null || chars.length ==0){
         return null;
      }
      if(StringUtils.isEmpty(separator) || separator.length() > 1){
         final StringBuilder buf = new StringBuilder();
         for (int i = 0; i < chars.length; i++) {
            buf.append(chars[i]).append(separator);
         }
         return buf.toString();
      }else{
         char tempChar = separator.charAt(0);
         return StringUtils.join(chars, tempChar);
      }
   }
}
