package bingo.cat;

import java.util.ArrayList;
import java.util.Iterator;

public class CatFile {
   private String filePath;
   private ArrayList<String> lines;
   private ArrayList<CatFileLine> fileLines;
   public CatFile(String filePath, ArrayList<String> lines) {
      this.filePath = filePath;
      this.lines = lines;
      fileLines = convertLines(lines);
   }
   public String getFilePath() {
      return filePath;
   }
   public ArrayList<String> getLines() {
      return lines;
   }
   public ArrayList<CatFileLine> getFileLines() {
      return fileLines;
   }
   
   //convenient method
   /**
    * 
    * @return
    */
   private ArrayList<CatFileLine> convertLines(ArrayList<String> lines){
      if(lines == null){
         return null;
      }
      ArrayList<CatFileLine> retList = new ArrayList<CatFileLine>();
      String tempLine = null;
      for (Iterator<String> iterator = lines.iterator(); iterator.hasNext();) {
         tempLine = (String) iterator.next();
         retList.add(new CatFileLine(tempLine));
      }
      return retList;
   }
   
   public ArrayList<String> getUpdatedLines(){
      ArrayList<String> updatedLines = new ArrayList<String>();
      for (Iterator<CatFileLine> iterator = fileLines.iterator(); iterator.hasNext();) {
         CatFileLine catFileLine = iterator.next();
         if(catFileLine.isUnchanged()){
            updatedLines.add(catFileLine.getLine());
         }else if(catFileLine.isModified()){
            updatedLines.add(catFileLine.getNewLine());
         }else if(catFileLine.isObsoleted()){
            continue;
         }
      }
      return updatedLines;
   }
   
   
   public void deleteLines(int from, int to){
      for (int i = from; i <= to; i++) {
         fileLines.get(i).remove();
      }
   }
   
   public CatFileLine getFileLine(int lineNo){
      return fileLines.get(lineNo);
   }
   
}
