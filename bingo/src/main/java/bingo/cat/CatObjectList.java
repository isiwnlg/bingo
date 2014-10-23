package bingo.cat;

import java.util.ArrayList;

public class CatObjectList {
   
   private ListType type;
   private ArrayList<CatObject> catObjectList = new ArrayList<CatObject>();
   private int[] startPos = {-1,-1};
   private int[] endPos ={-1,-1};

   
   public ListType getType() {
      return type;
   }
   public void setType(ListType type) {
      this.type = type;
   }
   public ArrayList<CatObject> getCatObjectList() {
      return catObjectList;
   }
   public void setCatObjectList(ArrayList<CatObject> catObjectList) {
      this.catObjectList = catObjectList;
   }
   public int[] getStartPos() {
      return startPos;
   }
   public void setStartPos(int[] startPos) {
      this.startPos = startPos;
   }
   public int[] getEndPos() {
      return endPos;
   }
   public void setEndPos(int[] endPos) {
      this.endPos = endPos;
   }
   
   public String toString(){
      return type + " : " + catObjectList.toString();
   }
   
   
   //convenient method
   public boolean add(CatObject catObject){
      return catObjectList.add(catObject);
   }
   
   public void setStartPos(int lineNo, int colNo){
      this.startPos[0] = lineNo;
      this.startPos[1] = colNo;
   }
   public void setEndPos(int lineNo, int colNo){
      this.endPos[0] = lineNo;
      this.endPos[1] = colNo;
   }
   
   public int getStartLineNo(){
      return this.startPos[0];
   }
   public int getEndLineNo(){
      return this.endPos[0];
   }
}
