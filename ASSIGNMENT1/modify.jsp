<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Modify" >

<table>

<tr><td>Phone</td><td><input type="text" name="phone" required></td></tr>
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
<tr><td>Aadhar card</td><td><input type="text"  name="aadhar" pattern="[0-9]{12}" title="invalid aadhar" required></td></tr>
<tr><td>Modify</td><td><input type="submit" name="Modify" onclick="Function2()"></td></tr>
</table>
</form>
<script>
function Function2()
{
	alert("Modified");
	}
</script>
</body>
</html>