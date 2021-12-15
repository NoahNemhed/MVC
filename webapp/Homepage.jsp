<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page errorPage = "Login.jsp" %>    
    
<%@ page import="com.loginmodule.model.LoginBean" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<% if(session.getAttribute("Signed-in") == null) {
		response.sendRedirect("Login.jsp");
}%>

<h1>Welcome! <%= session.getValue("username") %></h1>
<h4>Favourite programming language : <%if(session.getAttribute("favProLang") == null){
	out.print("Default not set");
	}else{
		out.print(session.getValue("favProLang"));
	}
	%> </h4>
	
	<br>
	<br>


	<form action="updatedHomePage" method="POST">
		<select name="favProgramLang">
			<option>Java</option>
			<option>Python</option>
			<option>JavaScript</option>
		</select>
		<input type="submit" value="submit">
	</form>


<form action="SessionRemoveServlet" method="POST"> 

		<input type="submit" value="Sign Out">	
	
	</form>
 




</body>
</html>