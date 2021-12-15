<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="SessionServlet" method="POST"> 
		<input name="uname" type="text" placeholder="Username">
		<br>
		<input name="pword" type="text" placeholder="Password">
		<br>
		<input type="submit" value="Sign in">	
	
	</form>


</body>
</html>