package bingo.cat.vo;

import java.util.ArrayList;

import bingo.cat.ObjidType;
import bingo.cat.ObjversionType;

/**
 * @author lulu
 *
 */
public class CatClass extends bingo.cat.vo.CatVoObject {

   private String packageName;
   private String viewName;
   private String tabName;
   private ObjversionType objversion = ObjversionType.timestamp;
   private ObjidType objid = ObjidType.rowid;
   
   public String getPackageName() {
      return packageName;
   }
   public void setPackageName(String packageName) {
      this.packageName = packageName;
   }
   public String getViewName() {
      return viewName;
   }
   public void setViewName(String viewName) {
      this.viewName = viewName;
   }
   public String getTabName() {
      return tabName;
   }
   public void setTabName(String tabName) {
      this.tabName = tabName;
   }
   public ObjversionType getObjversion() {
      return objversion;
   }
   public void setObjversion(ObjversionType objversion) {
      this.objversion = objversion;
   }
   public ObjidType getObjid() {
      return objid;
   }
   public void setObjid(ObjidType objid) {
      this.objid = objid;
   }
   public ArrayList<ClassAttribute> getClassAttributeList() {
      return classAttributeList;
   }
   public void setClassAttributeList(ArrayList<ClassAttribute> classAttributeList) {
      this.classAttributeList = classAttributeList;
   }
   public ArrayList<Association> getAssociationList() {
      return associationList;
   }
   public void setAssociationList(ArrayList<Association> associationList) {
      this.associationList = associationList;
   }
   private ArrayList<ClassAttribute> classAttributeList = new ArrayList<ClassAttribute>();
   private ArrayList<Association> associationList = new ArrayList<Association>();
   
}
