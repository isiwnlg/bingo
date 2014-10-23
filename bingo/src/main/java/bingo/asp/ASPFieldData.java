package bingo.asp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.asp.ASPField.DATATYPE;

public class ASPFieldData {
   private static final Logger logger = LoggerFactory.getLogger(ASPFieldData.class);
   
   private String Name;
   private String Value;
   private String DbValue;
   private DATATYPE type;
   
}
