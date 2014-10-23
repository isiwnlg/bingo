package bingo.cat.vo;

import java.util.ArrayList;
import java.util.Iterator;

import bingo.cat.CatObject;
import bingo.cat.ObjectType;

public class Association extends CatVoObject {
   private boolean primaryKey = false;
   private boolean mandatory = false;
   private boolean insertable = true;
   private boolean lov = false;
   private boolean updatable = true;
   private Role roleA;
   private Role roleB;
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
   public boolean isUpdatable() {
      return updatable;
   }
   public void setUpdatable(boolean updatable) {
      this.updatable = updatable;
   }
   public Role getRoleA() {
      return roleA;
   }
   public void setRoleA(Role roleA) {
      this.roleA = roleA;
   }
   public Role getRoleB() {
      return roleB;
   }
   public void setRoleB(Role roleB) {
      this.roleB = roleB;
   }
   
   
   public void buildFromCatObject(CatObject catObject){
      if(!catObject.is(ObjectType.Association)){
         throw new RuntimeException("ERROR: Wrong Object Type;");
      }
      
      this.setQuid(catObject.quid);
      this.setName(catObject.getName());
      
      boolean primaryKey = false;
      boolean mandatory = false;
      boolean insertable = true;
      boolean lov = true;
      boolean updatable = true;
      
      ArrayList<CatObject> attributesList = catObject.getListAttr("attributes");
      if(null != attributesList){
         for (Iterator iterator = attributesList.iterator(); iterator.hasNext();) {
            CatObject attributeObj = (CatObject) iterator.next();
            if(attributeObj.is(ObjectType.Attribute)){
               
               
               String tempName = attributeObj.getStrAttr("name");
               String tempValue = attributeObj.getStrAttr("value");
               if(tempName == null){
                  continue;
               }
               if("FieldFlags".equals(tempName)){
                  if(null != tempValue && tempValue.length() == 5){
                     primaryKey = tempValue.charAt(0) == 'K';
                     mandatory = tempValue.charAt(1) == 'M';
                     insertable = tempValue.charAt(2) == 'I';
                     lov = tempValue.charAt(4) == 'L';
                     updatable = tempValue.charAt(3) == 'U';
                  }
               }
               
               this.setPrimaryKey(primaryKey);
               this.setMandatory(mandatory);
               this.setInsertable(insertable);
               this.setUpdatable(updatable);
               this.setLov(lov);
            }
         }
      }
      
      ArrayList<CatObject> roleList = catObject.getListAttr("roles");
      if(roleList != null && roleList.size() == 2){
         Role roleA = new Role();
         roleA.buildFromCatObject(roleList.get(0));
         setRoleA(roleA);
         Role roleB = new Role();
         roleB.buildFromCatObject(roleList.get(1));
         setRoleB(roleB);
      }else{
         throw new RuntimeException("should not happen!");
      }
            
   }
}
