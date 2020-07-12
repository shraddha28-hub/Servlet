

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		try{
   			String user=request.getParameter("user");
   			out.println("<h1>WELCOME =======  "+user+"</h1>");
   		}
   		finally{
   			out.close();
   		}
	}

}
