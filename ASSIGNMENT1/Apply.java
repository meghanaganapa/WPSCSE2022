package webb;
import java.sql.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Apply
 */
@WebServlet("/Apply")
@MultipartConfig(maxFileSize = 16177215)
public class Apply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Apply() {
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
		String g=request.getParameter("dropdown");
		String fn=request.getParameter("fname");
		String ln=request.getParameter("lname");
		String ffn=request.getParameter("ffname");
		String fln=request.getParameter("flname");
		String dob=request.getParameter("dob");
		String p=request.getParameter("phone");
		String ee=request.getParameter("mail");
		String h=request.getParameter("dropdowng");
		String d=request.getParameter("code");
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
		Part filePart = request.getPart("fileupload");
		String ad=request.getParameter("aadhar");
	    
		InputStream inputStream = filePart.getInputStream();
		
			try { 
				Connection con;
			    Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
				String hw="Loading";
				Statement st=con.createStatement();
				PreparedStatement pa=con.prepareStatement("insert into sample.data(Categories,Firstname,Lastname,FatherFirstName,FatherLastName,DateofBirth,Email,Gender,BusPassCode,InstituteName,Institutecode,CourseName,Coursecode,AdmissionNo,Route,Routeend,Via,Address,City,Pincode,Bonafide,Aadhar,Phone,Applydate,Expirydate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				pa.setString(1,g );
			    pa.setString(2,fn );
			    System.out.println(hw);
			    pa.setString(3,ln );
			    pa.setString(4,ffn );
			    pa.setString(5,fln );
			    pa.setString(6,dob );
			    System.out.println(hw);
			    pa.setString(7,ee );
			    pa.setString(8,h );
			    pa.setString(9,d );
			    pa.setString(10,dl );
			    System.out.println(hw);
			    pa.setString(11,dkk);
			    pa.setString(12,uud );
			    pa.setString(13,ud );
			    pa.setString(14,id );
			    System.out.println(hw);
			    pa.setString(15,dq );
			    pa.setString(16,dw );
			    pa.setString(17,da );
			    pa.setString(18,ds );
			    System.out.println(hw);
			    pa.setString(19,dd );
			    pa.setString(20,dv);
			    if (inputStream != null) {
	                // fetches input stream of the upload file for the blob column
	                pa.setBlob(21, inputStream);
	            }
			    pa.setString(22,ad);
			    pa.setString(23, p);
			    pa.setDate(24,java.sql.Date.valueOf(java.time.LocalDate.now()));
			    pa.setDate(25,java.sql.Date.valueOf(java.time.LocalDate.now().plusMonths(3)));
			    int row = pa.executeUpdate();
			    
	            if (row > 0) {
	               String m = "File uploaded and saved into database";
	               System.out.println(m);
	            }
	            PrintWriter out = response.getWriter();  
	            out.println("Applied successfully");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

