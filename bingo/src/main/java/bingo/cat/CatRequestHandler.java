package bingo.cat;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.BingoRuntimeException;

/**
 * Servlet implementation class CatRequestHandler
 */
public class CatRequestHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private static final Logger logger = LoggerFactory.getLogger(CatRequestHandler.class); 
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatRequestHandler() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	   try {
         bingo.cat.CatObject.init();
      } catch (IOException e) {
         throw new ServletException(e);
      }
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   Map<String, String[]> parameterMap = request.getParameterMap();
	   
	   String[] quid = request.getParameterValues("quid");
	   
	   String prefix = null;
	   String paraValue = null;
	   char[] flag = null;
	   
      FieldType fieldType = FieldType.STRING; 
      Integer length = 0; 
      FieldFormat fieldFormat = FieldFormat.UNFORMATTED;
	   StringBuilder dataType = new StringBuilder();
	   
	   boolean primaryKey = true;
      boolean mandatory = true;
      boolean insertable = true;
      boolean lov = true;
      FieldUpdatable updatable = FieldUpdatable.NOTALLOWED;
      //         KMI-L
	   for (int i = 0; i < quid.length; i++) {
	      flag = new char[5];
         prefix = quid[i];  
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_primary_key");
         if(paraValue == null){
            flag[0] = 'A';
         }else{
            flag[0] = 'K';
         }
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_mandatory");
         if(paraValue == null){
            flag[1] = '-';
         }else{
            flag[1] = 'M';
         }
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_insertable");
         if(paraValue == null){
            flag[2] = '-';
         }else{
            flag[2] = 'I';
         }
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_lov");
         if(paraValue == null){
            flag[4] = '-';
         }else{
            flag[4] = 'L';
         }
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_updatable");
         
         updatable = FieldUpdatable.valueOf(paraValue);
         if(updatable.compareTo(FieldUpdatable.ALLOWED) == 0){
            flag[3] = 'U';
         }else if(updatable.compareTo(FieldUpdatable.ALLOWEDIFNULL) == 0){
            flag[3] = 'C';
         }else if(updatable.compareTo(FieldUpdatable.NOTALLOWED) == 0){
            flag[3] = '-';
         }
         String flagStr = CatObject.join(flag, "");
//         StringUtils.jo
         System.out.println(""+flagStr);
         
         
         
//         <%=classAttribute.getQuid()%>_bingo_attr_field_type
//         _bingo_attr_length
//         <%=classAttribute.getQuid()%>_bing_attr_format
         
         //
         paraValue = request.getParameter(prefix + "_bingo_attr_field_type");
         fieldType = FieldType.valueOf(paraValue);
         
         if(fieldType.compareTo(FieldType.DATE) != 0){
            paraValue = request.getParameter(prefix + "_bingo_attr_length");
            length = new Integer(paraValue);
         }
         
         paraValue = request.getParameter(prefix + "_bing_attr_format");
         fieldFormat = FieldFormat.valueOf(paraValue);
         
         
         if(fieldType.compareTo(FieldType.STRING) == 0){
            dataType.append(fieldType.name()).append('(').append(length).append(')');
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }else if(fieldType.compareTo(FieldType.DATE) == 0){
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }else if(fieldType.compareTo(FieldType.NUMBER) == 0){
            dataType.append(fieldType.name()).append('(').append(length).append(')');
            if(fieldFormat.compareTo(FieldFormat.UNFORMATTED) != 0){
               dataType.append('/').append(fieldFormat.name());
            }
         }
         
         System.out.println(dataType);
      }
	}

}
