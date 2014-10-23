package bingo.cat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 该类可以删除了，
 * @author lu
 *
 */
public class CatResolver implements CatConstants{
   private static final Logger logger = LoggerFactory.getLogger(CatResolver.class);
   
   public static void main(String[] args) throws IOException{
      
//      String filePath = "C:/workspace/xdpcosmis/b2e/res/constr.cat.java";
      String filePath = "C:/Users/lu/Desktop/quamng.cat";
      File file = new File(filePath);
      ArrayList<String> lines = (ArrayList<String>) FileUtils.readLines(file, "UTF-8");
      
      for(int lineNo = 0; lineNo<lines.size(); ){
         logger.debug("--------{}",lineNo);
         String line = lines.get(lineNo);
         if(StringUtils.isEmpty(line)){
            lineNo++;
            continue;
         }else if(CatObject.isObject(line)){
            int[] endPos = CatObject.getObjectEndPos(lines,lineNo);
            CatObject object = new CatObject(null);
            lineNo = object.buildObject(lines, lineNo, endPos[0]);
            System.out.println(object);
         }else{
            lineNo++;
            System.out.println("ERROR: LineNo" + lineNo + ": I DO NOT KNOW WHAT TO DO NOW!");
         }
      }
   }

}
