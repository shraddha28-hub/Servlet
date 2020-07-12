package com.nt.comp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	static {
		System.out.println("Servlet Loading");
	}
    public MyServletEx() {
        System.out.println("Servlet Insantiation");
    }
    public void init(){
    	System.out.println("Servlrt initilization");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request processing");
	}
     public void destroy(){
	System.out.println("Servlet Destroyed");
}

}
