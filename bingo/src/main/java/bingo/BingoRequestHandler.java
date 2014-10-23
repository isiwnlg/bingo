package bingo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bingo.asp.ASPManager;

/**
 * Servlet implementation class BingoRequestHandler
 */
public class BingoRequestHandler extends HttpServlet {
   private static final Logger logger           = LoggerFactory.getLogger(BingoRequestHandler.class);
   private static final long   serialVersionUID = 1L;

   public BingoRequestHandler() {
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      ASPManager mgr = new ASPManager(request, response);
      mgr.doService();
   }

}
