<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Apply" enctype = "multipart/form-data">
<table>

<tr><td>FirstName</td><td><input type="text" name="fname"></td></tr>
<tr><td>LastName</td><td><input type="text" name="lname"></td></tr>
<tr><td>Father's FirstName</td><td><input type="text" name="ffname"></td></tr>
<tr><td>Father's LastName</td><td><input type="text" name="flname"></td></tr>
<tr><td>Date of Birth(ddmmyyyy)</td><td><input type="text" name="dob"></td></tr>
<tr><td>Phone</td><td><input type="text" name="phone" ></td></tr>
<tr><td>Email</td><td><input type="email" name="mail"></td></tr>
<tr><td>Gender</td><td><select name = "dropdowng">
            <option value = "male" selected>Male</option>
            <option value = "female">Female</option>
            <option value = "others">Others</option>
         </select></td></tr>
<tr><td>Bus Pass Code</td><td><input type="text" name="code"></td></tr>
<tr><td>Categories</td><td><select name = "dropdown">
            <option value = "general" selected>General</option>
            <option value = "exclusive">Exclusive</option>
         </select></td></tr>
<tr><td>Institute Name</td><td><input type="text" name="iname" ></td></tr>
<tr><td>Institute code</td><td><input type="text" name="icode" ></td></tr>
<tr><td>Course Name</td><td><input type="text" name="cname" ></td></tr>
<tr><td>Course code</td><td><input type="text" name="ccode" ></td></tr>
<tr><td>Admission No</td><td><input type="text" name="id" ></td></tr>

<tr><td>Route</td><td><input type="text" name="routef" ></td></tr>
<tr><td>Routeend</td><td><input type="text" name="routee" ></td></tr>
<tr><td>Via</td><td><input type="text" name="via" ></td></tr>
<tr><td>Address</td><td><input type="text" name="add"></td></tr>
<tr><td>City</td><td><input type="text" name="city" ></td></tr>
<tr><td>Pincode</td><td><input type="text" name="pincode" ></td></tr>
<tr><td>Bonafide</td><td><input type = "file" name = "fileupload"   /></td></tr>
<tr><td>Aadhar card</td><td><input type="text"  name="aadhar" pattern="[0-9]{12}" title="invalid aadhar" required></td></tr>
<tr><td>Apply</td><td><input type="submit" name="Apply" onclick="Function()"></td></tr>
</table>

</form>
<script>
function Function()
{
	alert("Successfully Applied");
	}
</script>
</body>
</html>