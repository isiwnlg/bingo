package bingo.asp.layout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.asp.ASPBlock;

@SuppressWarnings("unused")
public class ASPBlockLayout {
   private static final Logger logger = LoggerFactory.getLogger(ASPBlockLayout.class);
   
   private ASPBlockLayoutMode layout;
   
   public static enum ASPBlockLayoutMode{
      single,multi,newRow,editRow,find,custom
   }
}
