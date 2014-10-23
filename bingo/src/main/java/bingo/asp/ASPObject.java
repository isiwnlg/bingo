package bingo.asp;

public class ASPObject {
   
   
   public static enum HiddenField{
      __command,
   }
   
   private ASPManager manager = null;
   
   protected ASPObject(ASPManager manager){
      this.manager = manager;
   }
   
   public ASPManager getManager() {
      return manager;
   }

   public void setManager(ASPManager manager) {
      this.manager = manager;
   }
}
