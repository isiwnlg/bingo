package bingo.cat.vo;

import org.apache.commons.lang3.StringUtils;

import bingo.cat.CatObject;
import bingo.cat.ObjectType;

public class Role extends CatVoObject {
   private String label;//=Name ?  程序员A修改
   private String Containment;
   private String supplier;
   private String quidu;
   private boolean navigatable;
   private boolean aggregate;
   public String getLabel() {
      return label;
   }
   public void setLabel(String label) {
      this.label = label;
   }
   public String getContainment() {
      return Containment;
   }
   public void setContainment(String containment) {
      Containment = containment;
   }
   public String getSupplier() {
      return supplier;
   }
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }
   public String getQuidu() {
      return quidu;
   }
   public void setQuidu(String quidu) {
      this.quidu = quidu;
   }
   public boolean isNavigatable() {
      return navigatable;
   }
   public void setNavigatable(boolean navigatable) {
      this.navigatable = navigatable;
   }
   public boolean isAggregate() {
      return aggregate;
   }
   public void setAggregate(boolean aggregate) {
      this.aggregate = aggregate;
   }
   
   public void buildFromCatObject(CatObject catObject){
      if(!catObject.is(ObjectType.Role)){
         throw new RuntimeException("ERROR: Wrong Object Type;");
      }
      this.setQuid(catObject.quid);
      this.setName(catObject.getName());
      this.setLabel(catObject.getStrAttr("label"));
      this.setContainment(catObject.getStrAttr("Containment"));
      this.setSupplier(catObject.getStrAttr("supplier"));
      this.setQuidu(catObject.getStrAttr("quidu"));
      this.setNavigatable(catObject.getBoolAttr("is_navigable"));
      this.setAggregate(catObject.getBoolAttr("is_aggregate"));
   }
   
   //convenient method
   public String getDisplayName(){
      if(StringUtils.isEmpty(label)){
         return "";
      }else{
         return label;
      }
   }
}
