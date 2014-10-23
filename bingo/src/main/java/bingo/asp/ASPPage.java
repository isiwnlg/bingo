package bingo.asp;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.BingoRuntimeException;

@SuppressWarnings("unused")
public class ASPPage extends ASPObject{
   private static final Logger logger = LoggerFactory.getLogger(ASPPage.class);
   
   private String pagePath;//javax.servlet.http.HttpServletRequest.getRequestURI()
   
   
   private Set<String> javascriptFiles = new LinkedHashSet<String>();
   private Set<String> cssFiles = new LinkedHashSet<String>();
   private StringBuilder dirtyJavascript = new StringBuilder();
   private StringBuilder dirtyCss = new StringBuilder();
   private Map<String, String> hiddenFieldsMap = new LinkedHashMap<String, String>();
   private Map<String, String> metaMap = new LinkedHashMap<String, String>();
   
   private Map<String, ASPBlock> blocksMap = new LinkedHashMap<String, ASPBlock>();
   private Map<String, ASPField> fieldsMap = new LinkedHashMap<String, ASPField>();
   
   
   {
      metaMap.put("", "");
   }
   
   
   
   public void appendMeta(String name, String value){
      if(metaMap.containsKey(name)){
         throw new BingoRuntimeException("ASP: duplate meta name: {1}", name);
      }else{
         metaMap.put(name, value);
      }
   }
   
   public Map<String, String> getMetaMap(){
      return metaMap;
   }
   
   
   public void appendDirtyCss(String css){
      dirtyJavascript.append(css).append("\r");
   }
   
   public StringBuilder getDirtyCss(){
      return dirtyJavascript;
   }
   
   public void appendHiddenField(String name, String value){
      if(fieldsMap.containsKey(name)){
         throw new BingoRuntimeException("ASP: duplate field name: {1}", name);
      }else if(hiddenFieldsMap.containsKey(name)){
         throw new BingoRuntimeException("ASP: duplate field name: {1}", name);
      }else{
         hiddenFieldsMap.put(name, value);
      }
   }
   
   public Map<String, String> getHiddenFieldsMap(){
      return hiddenFieldsMap;
   }
   
   public void appendDirtyJs(String js){
      dirtyJavascript.append(js).append("\r");
   }
   
   public StringBuilder getDirtyJs(){
      return dirtyJavascript;
   }
   
   
   public boolean addCssFiles(String fileName){
      return cssFiles.add(fileName);
   }
   
   public Set<String> getCssFiles(){
      return cssFiles;
   }
   
   public boolean addJsFiles(String fileName){
      return javascriptFiles.add(fileName);
   }
   
   public Set<String> getJsFiles(){
      return javascriptFiles;
   }
   
   
   protected ASPPage(ASPManager manager, String pagePath){
      super(manager);
      this.pagePath = pagePath;
   }
   
   public ASPBlock newASPBlock(String name, String viewName){
      if(StringUtils.isEmpty(name)){
         throw new BingoRuntimeException("ASP: block name can not be null.");
      }
      if(StringUtils.isEmpty(viewName)){
         throw new BingoRuntimeException("ASP: view name can not be null.");
      }
      if(blocksMap.containsKey(name)){
         throw new BingoRuntimeException("ASP: duplate block name: {1}", name);
      }
      return new ASPBlock(this, name, viewName);
   }
   
   public ASPField getASPField(String fieldName){
      ASPField field = fieldsMap.get(fieldName);
      if(null == field){
         throw new BingoRuntimeException("ASP: field name: {1} does not exist.", fieldName);
      }
      return field;
   }
   
   
   
   
   
   //register
   public void register(ASPBlock block){
      blocksMap.put(block.getName(), block);
   }
   
   public void register(ASPField field){
      fieldsMap.put(field.getName(), field);
   }
   
   //**getter and setters
   public String getPagePath() {
      return pagePath;
   }

   public Map<String, ASPBlock> getBlocksMap() {
      return blocksMap;
   }
}