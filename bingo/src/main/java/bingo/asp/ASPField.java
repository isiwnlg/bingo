package bingo.asp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 该类是对界面上表单元素的抽象，对应包括&lt;input&gt;&lt;select&gt;&lt;textarea&gt;
 * &lt;select&gt;。这个元素应该往<link>ASPBlock</link>上添加。这个类会定义这些属性的一个全集，在设置
 * 这些属性的时候，有可能元素会不支持，系统对于元素不支持的属性忽略。默认的是&lt;input&gt;。不推荐使用的属性不列出。
 * @author lu
 *
 */
@SuppressWarnings("unused")
public class ASPField extends ASPPageElement{
   private static final Logger logger = LoggerFactory.getLogger(ASPField.class);
   
   public static enum TYPE{
      button,checkbox,file,hidden,image,password,radio,reset,submit,text,select
   }
   public static enum DATATYPE{
      string,integer,money,datetime,time,date,number;
   }
   
   private String label;
   private String name;
   private TYPE type;
   private String value;
   private String alt;
   private String src;//定义以提交按钮形式显示的图像的 URL
   private String options;//LQW :有没有更好的处理办法？,,,,,checkbox的值
   private int size;
   private int maxlength;
   private int cols;
   private int rows;
   private boolean readonly = false;
   private boolean disabled = false;
   private boolean checked = false;
   private boolean multiple = false;//仅仅用于：select 标签多选
   
   //non-html attributes
   private DATATYPE dataType = DATATYPE.string;
   private String mask;
   private String dbName;
   private String function;
   private String lov;
   
   private String validation;
   
   //
   private boolean mandatory;
   
   public ASPField setValidation(String validation){
      this.validation = validation;
      return this;
   }
   
   public ASPField setCheckBox(String options){
      setType(TYPE.checkbox);
      this.options = options;
      return this;
   }
   
   
   public ASPField setLov(String lov){
      this.lov = lov;
      return this;
   }
   
   public String getLov(){
      return lov;
   }
   
   
   public boolean isMandatory(){
      return mandatory;
   }
   
   public ASPField setMandatory(){
      mandatory = true;
      return this;
   }
   
   public ASPField unsetMandatory(){
      mandatory = false;
      return this;
   }
   
   
   public String getFunction(){
      return this.function;
   }
   
   public ASPField setFunction(String function){
      this.function = function;
      return this;
   }
   
   //asp element
   private ASPBlock block;
   
   public ASPField(ASPBlock block, String name){
      this.block = block;
      this.name = name;
      
      this.block.getPage().register(this);
   }
   
   public ASPField setInsertable(){
      return setReadonly(false);
   } 
   
   public ASPField setReadonly(){
      return setReadonly(true);
   }
   
   public ASPField setHidden(){
      this.addClazz("hidden-field");//TODO LQW 
      return this;
   }
   
   public ASPField unsetHidden(){
      this.removeClazz("hidden-field");//TODO LQW 
      return this;
   }
   
   //**getter and setters
   public String getLabel() {
      return label;
   }

   public ASPField setLabel(String label) {
      this.label = label;
      return this;
   }

   public String getName() {
      return name;
   }

   public TYPE getType() {
      return type;
   }

   public ASPField setType(TYPE type) {
      this.type = type;
      return this;
   }

   public String getValue() {
      return value;
   }

   public ASPField setValue(String value) {
      this.value = value;
      return this;
   }

   public String getAlt() {
      return alt;
   }

   public ASPField setAlt(String alt) {
      this.alt = alt;
      return this;
   }

   public String getSrc() {
      return src;
   }

   public ASPField setSrc(String src) {
      this.src = src;
      return this;
   }

   public String getOptions() {
      return options;
   }

   public ASPField setOptions(String options) {
      this.options = options;
      return this;
   }

   public int getSize() {
      return size;
   }

   public ASPField setSize(int size) {
      this.size = size;
      return this;
   }

   public int getMaxlength() {
      return maxlength;
   }

   public ASPField setMaxlength(int maxlength) {
      this.maxlength = maxlength;
      return this;
   }

   public int getCols() {
      return cols;
   }

   public ASPField setCols(int cols) {
      this.cols = cols;
      return this;
   }

   public int getRows() {
      return rows;
   }

   public ASPField setRows(int rows) {
      this.rows = rows;
      return this;
   }

   public boolean isReadonly() {
      return readonly;
   }

   public ASPField setReadonly(boolean readonly) {
      this.readonly = readonly;
      return this;
   }

   public boolean isDisabled() {
      return disabled;
   }

   public ASPField setDisabled(boolean disabled) {
      this.disabled = disabled;
      return this;
   }

   public boolean isChecked() {
      return checked;
   }

   public ASPField setChecked(boolean checked) {
      this.checked = checked;
      return this;
   }

   public boolean isMultiple() {
      return multiple;
   }

   public ASPField setMultiple(boolean multiple) {
      this.multiple = multiple;
      return this;
   }

   public DATATYPE getDataType() {
      return dataType;
   }

   public ASPField setDataType(DATATYPE dataType) {
      this.dataType = dataType;
      return this;
   }

   public String getMask() {
      return mask;
   }

   public ASPField setMask(String mask) {
      this.mask = mask;
      return this;
   }

   public String getDbName() {
      return dbName;
   }

   public ASPField setDbName(String dbName) {
      this.dbName = dbName;
      return this;
   }

   public ASPBlock getBlock() {
      return block;
   }
}
