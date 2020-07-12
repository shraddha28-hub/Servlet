package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	PrintWriter out=null;
    	Connection con =null;
    	PreparedStatement ps=null;
        response.setContentType("text/html");
        out = response.getWriter();
	//get data from html
        String name = request.getParameter("name");
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String jprofile = request.getParameter("jprofile");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        try {
        
            // loading drivers for mysql
        	Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            //creating connection with the database 
             con = DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost:3306/db7","root","root");

               ps = con.prepareStatement
                        ("insert into student values(?,?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, fname);
            ps.setString(3, mname);
            ps.setString(4, jprofile);
            ps.setString(5, email);
            ps.setString(6, pass);
            int i = ps.executeUpdate();
            
            if(i > 0) {
                out.println("You are sucessfully registered");
            }
        
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	
    }
}