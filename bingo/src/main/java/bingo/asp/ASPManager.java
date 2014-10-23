package bingo.asp;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import bingo.BingoRuntimeException;


/**
 * 每一个请求对应一个ASPManager实例，ASPManager封装了servlet相关的内容。
 * @author lu
 *
 */
public class ASPManager {
   
   HttpServletRequest request; 
   HttpServletResponse response;
   
   ASPPage page;
   
   public ASPManager(HttpServletRequest request, HttpServletResponse response){
      this.request = request;
      this.response = response;
      
   }
   
   
   public void doService(){
      getPage();
      ((ASPPageProvider)page).main();
   }
   
   public void getPage() {
      
      //page name
      String packageName = "quaman";
      String className = "QuaInnerProc";
      
      String classFullName = "bingo.biz." + packageName + "." + className;
      
      try {
         Class clazz = Class.forName(classFullName);
         Constructor constructor = clazz.getConstructor(ASPManager.class, String.class);
         page = (ASPPage)constructor.newInstance(this,request.getRequestURI());
      } catch (ClassNotFoundException e) {
         throw new BingoRuntimeException(e);
      } catch (SecurityException e) {
         throw new BingoRuntimeException(e);
      } catch (NoSuchMethodException e) {
         throw new BingoRuntimeException(e);
      } catch (IllegalArgumentException e) {
         throw new BingoRuntimeException(e);
      } catch (InstantiationException e) {
         throw new BingoRuntimeException(e);
      } catch (IllegalAccessException e) {
         throw new BingoRuntimeException(e);
      } catch (InvocationTargetException e) {
         throw new BingoRuntimeException(e);
      }
   }
   
   
   
   
   
   public void showPage(String pageContents){
      if(StringUtils.isEmpty(pageContents)){
         pageContents = "";
      }
      ServletOutputStream out;
      try {
         out = response.getOutputStream();
         out.write(pageContents.getBytes());
         out.flush();
         out.close();
      } catch (IOException e) {
         throw new BingoRuntimeException(e);
      }
   }
   
   public ASPBlock newASPBlock(String name, String viewName){
      return page.newASPBlock(name, viewName);
   }
   
   //get page elements
   public ASPField getASPField(String fieldName){
      return page.getASPField(fieldName);
   }

}
