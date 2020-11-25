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
 * Servlet implementation class Modify
 */
@WebServlet("/Modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modify() {
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
		String p=request.getParameter("phone");
		String dl=request.getParameter("iname");
		String dkk=request.getParameter("icode");
		String uud=request.getParameter("cname");
		String ud=request.getParameter("ccode");
		String id=request.getParameter("id");
		String dq=request.getParameter("routef");
		String dw=request.getParameter("routee");
		String da=request.getParameter("via");
		String ds=request.getParameter("add");
		String dd=request.getParameter("city");
		String dv=request.getParameter("pincode");
		String add=request.getParameter("aadhar");
		Connection con;
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			String hw="Loading";
			Statement st=con.createStatement();
			String sqlUpdate= "UPDATE sample.data "
	                + "SET Phone=?,InstituteName=?,Institutecode=?,CourseName=?,Coursecode=?,AdmissionNo=?,Route=?,Routeend=?,Via=?,Address=?,City=?,Pincode=? "
	                + "WHERE Aadhar = ?";
			PreparedStatement paw = con.prepareStatement(sqlUpdate);
			paw.setString(1, p);
			
			 
			    paw.setString(2,dl );
			    System.out.println(hw);
			    paw.setString(3,dkk);
			    paw.setString(4,uud );
			    paw.setString(5,ud );
			    paw.setString(6,id );
			    System.out.println(hw);
			    paw.setString(7,dq );
			    paw.setString(8,dw );
			    paw.setString(9,da );
			    paw.setString(10,ds );
			    System.out.println(hw);
			    paw.setString(11,dd );
			    paw.setString(12,dv);
			    paw.setString(13,add);
			    ResultSet rs=st.executeQuery("select Aadhar from sample.data");
			    while(rs.next())
			    {
			    	if(rs.getString(1).equals(add))
			    	{
			    		paw.executeUpdate();
			    	}
			    	else
			    	{
			    		PrintWriter writer = response.getWriter();
			            
			            // build HTML code
			            String htmlRespone = "<html>";
			            htmlRespone += "<h2> Not account for specified credentials</h2>";      
			            
			            htmlRespone += "</html>";
			             
			            // return response
			            writer.println(htmlRespone);
			             
			    	}
			    }
			    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
