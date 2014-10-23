package bingo.asp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ASPRowSet {
   private static final Logger logger = LoggerFactory.getLogger(ASPRowSet.class);
   ASPBlock block;
   
   public ASPRowSet(ASPBlock block){
      this.block = block;
   }
   
   List<Map<String, ASPFieldData>> set = new ArrayList<Map<String,ASPFieldData>>();
   
   
   
   public void clear(){
      set.clear();
   }
   //--getter and setter
   public ASPBlock getBlock() {
      return block;
   }
   public List<Map<String, ASPFieldData>> getSet() {
      return set;
   }
}
