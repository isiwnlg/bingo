package bingo.cat;

public class CatFileLine {
   
   public String getFilePath() {
      return filePath;
   }

   public void setFilePath(String filePath) {
      this.filePath = filePath;
   }
   
   public CatFileLine(String line){
      this.line = line;
   }
   
   public String getLine() {
      return line;
   }

   public LineStatus getStatus() {
      return status;
   }

   public String getNewLine() {
      return newLine;
   }

   private String line;
   private LineStatus status = LineStatus.NOCHANGE;
   private String newLine;
   private String filePath;

   
   //convenient method
   public void remove(){
      this.status = LineStatus.OBSOLETE;
   }
   
   public void update(String newLine){
      this.status = LineStatus.MODIIFED;
      this.newLine = newLine;
   }
   
   public boolean isUnchanged(){
      return this.status.compareTo(LineStatus.NOCHANGE) == 0;
   }
   public boolean isObsoleted(){
      return this.status.compareTo(LineStatus.OBSOLETE) == 0;
   }
   public boolean isModified(){
      return this.status.compareTo(LineStatus.MODIIFED) == 0;
   }
}
