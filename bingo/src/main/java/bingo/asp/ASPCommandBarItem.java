package bingo.asp;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ASPCommandBarItem extends ASPPageElement{
   private static final Logger logger = LoggerFactory.getLogger(ASPCommandBarItem.class);
   
   private String commandId;
   private String commandType;//LQW 可以支持多种类型的命令
   private String commandContents;
   
   private ASPCommandBar commandBar;
   
   protected ASPCommandBarItem(ASPCommandBar commandBar, String commandId){
      this.commandBar = commandBar;
      this.commandId = commandId;
   }

   public String getCommandId() {
      return commandId;
   }

   public String getCommandType() {
      return commandType;
   }

   public void setCommandType(String commandType) {
      this.commandType = commandType;
   }

   public String getCommandContents() {
      return commandContents;
   }

   public void setCommandContents(String commandContents) {
      this.commandContents = commandContents;
   }

   public ASPCommandBar getCommandBar() {
      return commandBar;
   }
}