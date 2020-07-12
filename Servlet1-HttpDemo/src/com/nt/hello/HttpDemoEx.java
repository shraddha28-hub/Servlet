package com.nt.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemoEx extends HttpServlet {
	
  
	private static final long serialVersionUID = 1L;

	public HttpDemoEx(){
    	
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	   out.println("<h1>This is HTTP</h1>");	
	
	}

}
