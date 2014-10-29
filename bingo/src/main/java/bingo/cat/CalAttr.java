package bingo.cat;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;

public class CalAttr implements CatConstants{
   private String tool = "Foundation1";
   private String name;
   private String value;
   public String getTool() {
      return tool;
   }
   public void setTool(String tool) {
      this.tool = tool;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getValue() {
      return value;
   }
   public void setValue(String value) {
      this.value = value;
   }
   
   public CalAttr(String name, String value){
      this.name = name;
      this.value = value;
   }
   public String toCatObjectStr(String prefix){
      StringBuilder sb = new StringBuilder();
      sb.append(prefix).append("(object Attribute").append(NEW_LINE);
      sb.append(prefix).append(FOUR_SPACE).append(StringUtils.rightPad("tool", 11)).append(CHAR_T).append(CatObject.quoteStr(tool)).append(NEW_LINE);
      sb.append(prefix).append(FOUR_SPACE).append(StringUtils.rightPad("name", 11)).append(CHAR_T).append(CatObject.quoteStr(name)).append(NEW_LINE);
      sb.append(prefix).append(FOUR_SPACE).append(StringUtils.rightPad("value", 11)).append(CHAR_T).append(CatObject.quoteStr(value)).append(')');
      
      return sb.toString();
   }
   
   
   public String toString(){
      return toCatObjectStr("");
   }
   public static void main(String[] args) {
      
      String prefix = "            ";
      StringBuilder sb = new StringBuilder();
      ArrayList<CalAttr> attrList = new ArrayList<CalAttr>();
      attrList.add(new CalAttr("FieldFormat", "STRING(200)"));
      attrList.add(new CalAttr("FieldFlags", "A-IUL"));
      
      
      sb.append(prefix).append("attributes   (list Attribute_Set").append(NEW_LINE);
      for (Iterator iterator = attrList.iterator(); iterator.hasNext();) {
         CalAttr calAttr = (CalAttr) iterator.next();
         sb.append(calAttr.toCatObjectStr(prefix));
         if(iterator.hasNext()){
            sb.append(NEW_LINE);
         }else{
            sb.append(")");
         }
      }
      
      System.out.println(sb);
   }
}
