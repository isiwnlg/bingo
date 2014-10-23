package bingo.cat.vo;

import java.util.ArrayList;

import bingo.cat.CatObject;
import bingo.cat.ObjectType;

public class Role extends CatVoObject {
   private String supplier;
   private String quidu;
   private boolean navigatable;
   private boolean aggregate;
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
      
      this.setSupplier(catObject.getStrAttr("supplier"));
      this.setQuidu(catObject.getStrAttr("quidu"));
      this.setNavigatable(catObject.getBoolAttr("is_navigable"));
      this.setAggregate(catObject.getBoolAttr("is_aggregate"));
   }
}
