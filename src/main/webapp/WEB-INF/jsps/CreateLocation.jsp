<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<form action="saveloc" method="POST">
Id   : <input type = "text" name ="id"><br>
Name : <input type = "text" name ="name"><br>
Code : <input type = "text" name ="code"><br>
type : Urban <input type = "radio" name ="type" value ="urban" ><br>
	   Rural <input type = "radio" name ="type" value ="rural"><br>
<input type = "submit" name ="save"><br>
</form>
${msg}

<a href ="displaylocations">VIEW ALL</a>
</body>
</html>