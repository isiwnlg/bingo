package bingo.cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CatConstants {
   public static final char CHAR_LEFT_BRACKET = '(';
   public static final char CHAR_RIGHT_BRACKET = ')';
   public static final char CHAR_QUOTE = '"';
   public static final char CHAR_SPACE = ' ';
   public static final char CHAR_T = '\t';
   public static final char CHAR_N = '\n';
   public static final char NEW_LINE = '\n';
   
   public static final String CAT_TAB_SPACE = "    ";
   
   public static final String CAT_OBJECT = "(object";
   public static final String CAT_LIST = "(list";
   
   
   public static final Map<FieldType, List<FieldFormat>> typeFormatMap = new HashMap<FieldType, List<FieldFormat>>(){
      private static final long serialVersionUID = -5566605537234361749L;
      {
         List<FieldFormat> tempFormatList = null;
         tempFormatList = new ArrayList<FieldFormat>();
         tempFormatList.add(FieldFormat.UNFORMATTED);
         tempFormatList.add(FieldFormat.UPPERCASE);
         tempFormatList.add(FieldFormat.LOWERCASE);
         tempFormatList.add(FieldFormat.INVISIBLE);
         put(FieldType.STRING, tempFormatList);
         
         tempFormatList = new ArrayList<FieldFormat>();
         tempFormatList.add(FieldFormat.UNFORMATTED);
         tempFormatList.add(FieldFormat.DATE);
         tempFormatList.add(FieldFormat.DATETIME);
         tempFormatList.add(FieldFormat.TIME);
         tempFormatList.add(FieldFormat.INVISIBLE);
         put(FieldType.DATE, tempFormatList);
         
         tempFormatList = new ArrayList<FieldFormat>();
         tempFormatList.add(FieldFormat.UNFORMATTED);
         tempFormatList.add(FieldFormat.CURRENCY);
         tempFormatList.add(FieldFormat.DECIMAL);
         tempFormatList.add(FieldFormat.PERCENTAGE);
         tempFormatList.add(FieldFormat.INVISIBLE);
         put(FieldType.NUMBER, tempFormatList);
      }
   };

   
}
