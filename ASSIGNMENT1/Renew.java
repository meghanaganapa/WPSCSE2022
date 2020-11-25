package webb;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Renew
 */
@WebServlet("/Renew")
@MultipartConfig(maxFileSize = 16177215)   
public class Renew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Renew() {
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
		String h=request.getParameter("dropdown");
		String add=request.getParameter("aadhar");
		Part filePart = request.getPart("fileupload");
		InputStream inputStream = filePart.getInputStream();
		Connection con;
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			String hw="Loading";
			Statement st=con.createStatement();
			String sqlUpdate= "UPDATE sample.data "
	                + "SET Categories=?,Bonafide = ?,Applydate=?,Expirydate=? "
	                + "WHERE Aadhar = ?";
			PreparedStatement pa = con.prepareStatement(sqlUpdate);

			  pa.setString(1,h );
			  System.out.println(hw);
			    
			    if (inputStream != null) {
	                // fetches input stream of the upload file for the blob column
	                pa.setBlob(2, inputStream);
	            }
			    pa.setString(5, add);
			    pa.setDate(3,java.sql.Date.valueOf(java.time.LocalDate.now()));
			    pa.setDate(4,java.sql.Date.valueOf(java.time.LocalDate.now().plusMonths(3)));
			    ResultSet rs=st.executeQuery("select Aadhar from sample.data");
			    while(rs.next())
			    {
			    	if(rs.getString(1).equals(add))
			    	{
			    		pa.executeUpdate();
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

