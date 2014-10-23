package bingo.asp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ASPPageProvider extends ASPPage{
   private static final Logger logger = LoggerFactory.getLogger(ASPPageProvider.class);
   private ASPManager mgr;
   public ASPPageProvider(ASPManager manager, String pagePath) {
      super(manager, pagePath);
      mgr = manager;
   }

   StringBuilder out = new StringBuilder();
   
   public void main(){
      definePage();
      run();
      showPage();
   }
   
   public void definePage(){
      //get from cache
      //if have return;
      //else continue;
      ASPBlock block = newASPBlock("MAIN", "QUA_NCR");
      
      block.addField("NCR_CODE").setLabel("ASP: Ncr Code");
      block.addField("DRAFT_DATE").setLabel("ASP: Draft Date").setDataType(ASPField.DATATYPE.date);
     
      ASPCommandBar commandBar = block.newASPCommandBar();
      
      commandBar.addCommandBarItem("z").setCommandContents("contents");
      commandBar.addCommandBarItem("z1").setCommandContents("contents");
   }
   
   
   //页面所有请求的入口
   public void run(){
      //处理页面的请求
   }
   
   public void showPage(){
      mgr.showPage(getContents());
   }
   
   protected String getContents(){  
      //输出页面内容
      out.append("<!DOCTYPE html>").append("\n");
      out.append("<html lang=\"zh-cn\">").append("\n");
      out.append("  <head >").append("\n");
      out.append("    <title>New Layout</title>").append("\n");
      out.append("    <meta charset=\"utf-8\">").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      out.append("").append("\n");
      
      
      
      
      
      //通用开头
       
      //通用结尾
      return out.toString();
   }
   
}
