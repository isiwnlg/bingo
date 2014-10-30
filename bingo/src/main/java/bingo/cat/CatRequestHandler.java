package bingo.cat;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.BingoRuntimeException;

/**
 * Servlet implementation class CatRequestHandler
 */
public class CatRequestHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private static final Logger logger = LoggerFactory.getLogger(CatRequestHandler.class); 
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatRequestHandler() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	   try {
         bingo.cat.CatObject.init();
      } catch (IOException e) {
         throw new ServletException(e);
      }
	}

	
	private void updateAttribute(CatFile catFile, HttpServletRequest request){
      String[] attrQuids = request.getParameterValues("attribute_quid");
      String attrQuid = null;
      String paraValue = null;
      char[] flag = null;
      
      FieldType fieldType = FieldType.STRING; 
      Integer length = 0; 
      FieldFormat fieldFormat = FieldFormat.UNFORMATTED;
      StringBuilder dataType = new StringBuilder();
      
      boolean primaryKey = true;
      boolean mandatory = true;
      boolean insertable = true;
      boolean lov = true;
      FieldUpdatable updatable = FieldUpdatable.NOTALLOWED;
      
      ArrayList<CalAttr> attrList = null;
      CatObject attrObj = null;
      CatObjectList catObjectList  = null;
      for (int i = 0; i < attrQuids.length; i++) {
         attrList = new ArrayList<CalAttr>();
         flag = new char[5];
         attrQuid = attrQuids[i];  
         
         //FieldFlag
         paraValue = request.getParameter(attrQuid + "_bingo_attr_primary_key");
         if(paraValue == null){
            flag[0] = 'A';
         }else{
            flag[0] = 'K';
         }
         
         //
         paraValue = request.getParameter(attrQuid + "_bingo_attr_mandatory");
         if(paraValue == null){
            flag[1] = '-';
         }else{
            flag[1] = 'M';
         }
         
         //
         paraValue = request.getParameter(attrQuid + "_bingo_attr_insertable");
         if(paraValue == null){
            flag[2] = '-';
         }else{
            flag[2] = 'I';
         }
         
         //
         paraValue = request.getParameter(attrQuid + "_bingo_attr_lov");
         if(paraValue == null){
            flag[4] = '-';
         }else{
            flag[4] = 'L';
         }
         
         //
         paraValue = request.getParameter(attrQuid + "_bingo_attr_updatable");
         
         updatable = FieldUpdatable.valueOf(paraValue);
         if(updatable.compareTo(FieldUpdatable.ALLOWED) == 0){
            flag[3] = 'U';
         }else if(updatable.compareTo(FieldUpdatable.ALLOWEDIFNULL) == 0){
            flag[3] = 'C';
         }else if(updatable.compareTo(FieldUpdatable.NOTALLOWED) == 0){
            flag[3] = '-';
         }
         String flagStr = CatObject.join(flag, "");
         attrList.add(new CalAttr("FieldFlags", flagStr));
         
         //FieldFormat
         paraValue = request.getParameter(attrQuid + "_bingo_attr_field_type");
         fieldType = FieldType.valueOf(paraValue);
         if(fieldType.compareTo(FieldType.DATE) != 0){
            paraValue = request.getParameter(attrQuid + "_bingo_attr_length");
            if(!StringUtils.isEmpty(paraValue)){
               length = new Integer(paraValue);
            }
         }
         
         paraValue = request.getParameter(attrQuid + "_bing_attr_format");
         fieldFormat = FieldFormat.valueOf(paraValue);
         
         dataType = new StringBuilder();
         if(fieldType.compareTo(FieldType.STRING) == 0 ){
            dataType.append(fieldType.name());
            if(length != 0){
               dataType.append('(').append(length).append(')');
            }
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }else if(fieldType.compareTo(FieldType.DATE) == 0){
            dataType.append(fieldType.name());
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }else if(fieldType.compareTo(FieldType.NUMBER) == 0){
            dataType.append(fieldType.name());//.append('(').append(length).append(')');
            if(length != 0){
               dataType.append('(').append(length).append(')');
            }
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }
         attrList.add(new CalAttr("FieldFormat", dataType.toString()));
         
         attrObj = CatObject.register.get(attrQuid);
         catObjectList = attrObj.getCatObjectList("attributes");
         StringBuilder sb = new StringBuilder();
         if(null == catObjectList) {
            int objStartLineNo = attrObj.startRowCol[0];
            CatFileLine objLine = catFile.getFileLine(objStartLineNo);
            sb.append(objLine.getLine()).append(CatConstants.NEW_LINE);
            String prefix = CatObject.getPrefix(objLine.getLine());//tabs ....
            sb.append(prefix).append(CatConstants.FOUR_SPACE).append("attributes   (list Attribute_Set").append(CatConstants.NEW_LINE);
            for (Iterator<CalAttr> iterator = attrList.iterator(); iterator.hasNext();) {
               CalAttr calAttr = (CalAttr) iterator.next();
               sb.append(calAttr.toCatObjectStr(prefix + CatConstants.CHAR_T));
               if(iterator.hasNext()){
                  sb.append(CatConstants.NEW_LINE);
               }else{
                  sb.append(")");
               }
            }
            objLine.update(sb.toString());
         }else{//catObjectList.size() >= 0
            int objStartLineNo = attrObj.startRowCol[0];
            CatFileLine objLine = catFile.getFileLine(objStartLineNo);
            String prefix = CatObject.getPrefix(objLine.getLine());
            
            int startLineNo = catObjectList.getStartLineNo();
            int endLineNo = catObjectList.getEndLineNo();
            catFile.deleteLines(startLineNo, endLineNo);
            CatFileLine tempLine = catFile.getFileLine(startLineNo);
           
            sb.append(tempLine.getLine()).append(CatConstants.NEW_LINE);//TODO list 为空的情况没有考虑
            for (Iterator<CalAttr> iterator = attrList.iterator(); iterator.hasNext();) {
               CalAttr calAttr = iterator.next();
               sb.append(calAttr.toCatObjectStr(prefix + CatConstants.CHAR_T));
               if(iterator.hasNext()){
                  sb.append(CatConstants.NEW_LINE);
               }else{
                  sb.append(")");
               }
            }
            tempLine.update(sb.toString());
         }
      }
	}
	private void updateAssociation(CatFile catFile, HttpServletRequest request){
	   String[] associationQuids = request.getParameterValues("association_quid");
	   String assoQuid = null;
	   String paraValue = null;
	   char[] flag = null;
	   
	   FieldType fieldType = FieldType.STRING; 
	   Integer length = 0; 
	   FieldFormat fieldFormat = FieldFormat.UNFORMATTED;
	   StringBuilder dataType = new StringBuilder();
	   
	   boolean primaryKey = true;
	   boolean mandatory = true;
	   boolean insertable = true;
	   boolean lov = true;
	   FieldUpdatable updatable = FieldUpdatable.NOTALLOWED;
	   
	   ArrayList<CalAttr> attrList = null;
	   CatObject assoObject = null;
	   CatObjectList catObjectList  = null;
	   for (int i = 0; i < associationQuids.length; i++) {
	      attrList = new ArrayList<CalAttr>();
	      flag = new char[5];
	      assoQuid = associationQuids[i];  
	      
	      //FieldFlag
	      paraValue = request.getParameter(assoQuid + "_bingo_asso_primary_key");
	      if(paraValue == null){
	         flag[0] = 'A';
	      }else{
	         flag[0] = 'K';
	      }
	      
	      //
	      paraValue = request.getParameter(assoQuid + "_bingo_asso_mandatory");
	      if(paraValue == null){
	         flag[1] = '-';
	      }else{
	         flag[1] = 'M';
	      }
	      
	      //
	      paraValue = request.getParameter(assoQuid + "_bingo_asso_insertable");
	      if(paraValue == null){
	         flag[2] = '-';
	      }else{
	         flag[2] = 'I';
	      }
	      
	      //
	      paraValue = request.getParameter(assoQuid + "_bingo_asso_lov");
	      if(paraValue == null){
	         flag[4] = '-';
	      }else{
	         flag[4] = 'L';
	      }
	      
	      //
	      paraValue = request.getParameter(assoQuid + "_bingo_asso_updatable");
	      
	      updatable = FieldUpdatable.valueOf(paraValue);
	      if(updatable.compareTo(FieldUpdatable.ALLOWED) == 0){
	         flag[3] = 'U';
	      }else if(updatable.compareTo(FieldUpdatable.ALLOWEDIFNULL) == 0){
	         flag[3] = 'C';
	      }else if(updatable.compareTo(FieldUpdatable.NOTALLOWED) == 0){
	         flag[3] = '-';
	      }
	      String flagStr = CatObject.join(flag, "");
	      attrList.add(new CalAttr("FieldFlags", flagStr));
	      
	    
	      assoObject = CatObject.register.get(assoQuid);
	      catObjectList = assoObject.getCatObjectList("attributes");
	      StringBuilder sb = new StringBuilder();
	      if(null == catObjectList) {
	         int objStartLineNo = assoObject.startRowCol[0];
	         CatFileLine objLine = catFile.getFileLine(objStartLineNo);
	         sb.append(objLine.getLine()).append(CatConstants.NEW_LINE);
	         String prefix = CatObject.getPrefix(objLine.getLine());//tabs ....
	         sb.append(prefix).append(CatConstants.FOUR_SPACE).append("attributes   (list Attribute_Set").append(CatConstants.NEW_LINE);
	         for (Iterator<CalAttr> iterator = attrList.iterator(); iterator.hasNext();) {
	            CalAttr calAttr = (CalAttr) iterator.next();
	            sb.append(calAttr.toCatObjectStr(prefix + CatConstants.CHAR_T));
	            if(iterator.hasNext()){
	               sb.append(CatConstants.NEW_LINE);
	            }else{
	               sb.append(")");
	            }
	         }
	         objLine.update(sb.toString());
	      }else{//catObjectList.size() >= 0
	         int objStartLineNo = assoObject.startRowCol[0];
	         CatFileLine objLine = catFile.getFileLine(objStartLineNo);
	         String prefix = CatObject.getPrefix(objLine.getLine());
	         
	         int startLineNo = catObjectList.getStartLineNo();
	         int endLineNo = catObjectList.getEndLineNo();
	         catFile.deleteLines(startLineNo, endLineNo);
	         CatFileLine tempLine = catFile.getFileLine(startLineNo);
	         
	         sb.append(tempLine.getLine()).append(CatConstants.NEW_LINE);//TODO list 为空的情况没有考虑
	         for (Iterator<CalAttr> iterator = attrList.iterator(); iterator.hasNext();) {
	            CalAttr calAttr = iterator.next();
	            sb.append(calAttr.toCatObjectStr(prefix + CatConstants.CHAR_T));
	            if(iterator.hasNext()){
	               sb.append(CatConstants.NEW_LINE);
	            }else{
	               sb.append(")");
	            }
	         }
	         tempLine.update(sb.toString());
	      }
	   }
	}
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   Map<String, String[]> parameterMap = request.getParameterMap();
	   String classQuid = request.getParameter("class_quid");
      CatObject classObj = CatObject.register.get(classQuid);
	   CatFile catFile = classObj.catFile;
	   
	   updateAttribute(catFile, request);
	   updateAssociation(catFile, request);
	   
	   CatObject.outputCatFile(catFile, new File("C:\\Users\\lu\\tempCatFile.cat"));
	}

}
