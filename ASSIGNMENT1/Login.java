package webb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public int authenticate(String u, String p)
	{
	   
	    int j=0;
		try {
			 Connection con;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("Xampp");
		    Statement st=con.createStatement();
		    ResultSet rs = st.executeQuery("select * from sample.logintable;");
		    while(rs.next())
		    {
		    	String n = rs.getString("username");
		    	String m = rs.getString("password");
		    	if(n.equals(u) && m.equals(p))
		    	{
		    		j=1;
		    		return 1;
		    	}
		    }
		    if(j==0)
		    {
		    	return j;
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	    
	}
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();  
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
       
        int h=authenticate(uname, pass);
        out.print("You are successfully registered...");  
        if(h==1)
        {
       	 response.sendRedirect("member.html");
        }
        else
        {
        	response.sendRedirect("error.html");
        }
        
	}

}
