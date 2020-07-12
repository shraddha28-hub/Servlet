import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String jprofile = request.getParameter("jprofile");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        try {
        
            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");
            
            //creating connection with the database 
            Connection con = DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost:3306/db7","root","root");

            PreparedStatement ps = con.prepareStatement
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