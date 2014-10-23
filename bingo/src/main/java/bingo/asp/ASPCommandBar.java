package bingo.asp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.BingoRuntimeException;

@SuppressWarnings("unused")
public class ASPCommandBar extends ASPPageElement{
   private static final Logger logger = LoggerFactory.getLogger(ASPCommandBar.class);
   
   //
   private ASPBlock block;
   private Map<String, ASPCommandBarItem> commandBarItemsMap = new LinkedHashMap<String, ASPCommandBarItem>();
   
   protected ASPCommandBar(ASPBlock block){
      this.block = block;
   }
   
   public ASPCommandBarItem addCommandBarItem(String commandId){
      if(StringUtils.isEmpty(commandId)){
         throw new BingoRuntimeException("ASP: command id is empty.");
      }
      if(commandBarItemsMap.containsKey(commandId)){
         throw new BingoRuntimeException("ASP: duplate command id: {1}", commandId);
      }
      ASPCommandBarItem commandItem = new ASPCommandBarItem(this, commandId);
      commandBarItemsMap.put(commandId, commandItem);
      return commandItem;
   }
   
   //**getter and setters
   public ASPBlock getBlock() {
      return block;
   }
   
   public Map<String, ASPCommandBarItem> getCommandBarItemsMap() {
      return commandBarItemsMap;
   }
}
