package bingo.asp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.BingoRuntimeException;
import bingo.asp.layout.ASPBlockLayout;

@SuppressWarnings("unused")
public class ASPBlock extends ASPPageElement{
   private static final Logger logger = LoggerFactory.getLogger(ASPBlock.class);
   
   private String name;
   private String viewName;
   private String luName;
   private String luKeys;
   
   //
   private ASPPage page;
   private ASPBlock masterBlock;
   private ASPCommandBar commandBar;
   private ASPBlockLayout blockLayout;
   private Map<String, ASPField> fieldsMap = new LinkedHashMap<String, ASPField>();
   private ASPRowSet rowset = new ASPRowSet(this);
   

   protected ASPBlock(ASPPage page, String name, String viewName){
      this.page = page;
      this.name = name;
      this.viewName = name;
      this.luName = viewName;//LQW 待考虑
      this.luKeys = viewName;//LQW 待考虑
      
      
      page.register(this);
   }
   
   public ASPField addField(String name){
      return addField(name, ASPField.DATATYPE.string, null);
   }
   public ASPField addField(String name, ASPField.DATATYPE type){
      return addField(name, type, null);
   }
   public ASPField addField(String name, ASPField.DATATYPE type, String mask){
      if(StringUtils.isEmpty(name)){
         throw new BingoRuntimeException("ASP: field name can not be null.");
      }
      if(fieldsMap.containsKey(name)){
         throw new BingoRuntimeException("ASP: duplate field name: {1}", name);
      }
      ASPField field = new ASPField(this, name);
      field.setDataType(type);
      field.setMask(mask);
      fieldsMap.put(name, field);
      return field;
   }
   
   public ASPCommandBar newASPCommandBar(){
      if(null != commandBar){
         throw new BingoRuntimeException("ASP: commandbar has already existed.");
      }
      return new ASPCommandBar(this);
   }
   
   //**getter and setters
   public String getName() {
      return name;
   }

   public String getViewName() {
      return viewName;
   }

   public String getLuName() {
      return luName;
   }

   public String getLuKeys() {
      return luKeys;
   }

   public ASPPage getPage() {
      return page;
   }

   public ASPBlock getMasterBlock() {
      return masterBlock;
   }

   public ASPCommandBar getCommandBar() {
      return commandBar;
   }

   public ASPBlockLayout getBlockLayout() {
      return blockLayout;
   }

   public Map<String, ASPField> getFieldsMap() {
      return fieldsMap;
   }
   
   public ASPRowSet getRowset() {
      return rowset;
   }
}
