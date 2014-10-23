package bingo.cat.vo;

import bingo.cat.FieldFormat;
import bingo.cat.FieldType;
import bingo.cat.FieldUpdatable;

public class ClassAttribute extends bingo.cat.vo.CatVoObject{
   private int length;
   private FieldType fieldType;
   private FieldFormat fieldFormat;
   private String prompt;
   private boolean primaryKey = false;
   private boolean mandatory = false;
   private boolean insertable = true;
   private boolean lov = true;
   private FieldUpdatable updatable; 
   
   public int getLength() {
      return length;
   }
   public void setLength(int length) {
      this.length = length;
   }

   public FieldType getFieldType() {
      return fieldType;
   }
   public void setFieldType(FieldType fieldType) {
      this.fieldType = fieldType;
   }
   public FieldFormat getFieldFormat() {
      return fieldFormat;
   }
   public void setFieldFormat(FieldFormat fieldFormat) {
      this.fieldFormat = fieldFormat;
   }
   public String getPrompt() {
      return prompt;
   }
   public void setPrompt(String prompt) {
      this.prompt = prompt;
   }
   public boolean isPrimaryKey() {
      return primaryKey;
   }
   public void setPrimaryKey(boolean primaryKey) {
      this.primaryKey = primaryKey;
   }
   public boolean isMandatory() {
      return mandatory;
   }
   public void setMandatory(boolean mandatory) {
      this.mandatory = mandatory;
   }
   public boolean isInsertable() {
      return insertable;
   }
   public void setInsertable(boolean insertable) {
      this.insertable = insertable;
   }
   public boolean isLov() {
      return lov;
   }
   public void setLov(boolean lov) {
      this.lov = lov;
   }
   public FieldUpdatable getUpdatable() {
      return updatable;
   }
   public void setUpdatable(FieldUpdatable updatable) {
      this.updatable = updatable;
   }
}
