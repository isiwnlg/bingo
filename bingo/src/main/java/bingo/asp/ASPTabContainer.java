package bingo.asp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ASPTabContainer extends ASPPageElement{
   private static final Logger logger = LoggerFactory.getLogger(ASPTabContainer.class);
   
   //
   Map<String, ASPTab> tabsMap = new LinkedHashMap<String, ASPTab>();
   
}
