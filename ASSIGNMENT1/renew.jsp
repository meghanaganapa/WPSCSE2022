<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Renewal</h2>
<form method="post" action="Renew" enctype = "multipart/form-data">

<table>


<tr><td>Categories</td><td><select name = "dropdown">
            <option value = "general" selected>General</option>
            <option value = "exclusive">Exclusive</option>
         </select></td></tr>


<tr><td>Bonafide</td><td><input type = "file" name = "fileupload" required/></td></tr>
<tr><td>Aadhar card</td><td><input type="text"  name="aadhar" pattern="[0-9]{12}" title="invalid aadhar" required></td></tr>
<tr><td>Update</td><td><input type="submit" name="Apply" onclick="Function1()"></td></tr>
</table>
</form>
<script>
function Function1()
{
	alert("Updated");
	}
</script>
</body>
</html>