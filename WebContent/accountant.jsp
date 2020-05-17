<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>accountant</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("index.html");
	}
%>

<a href="addstudent.jsp"> Add Student</a> <br><br>

<a href="searchstudent.jsp">  Edit Student</a> <br><br>

<a href="searchstudent.jsp"> Due Fee</a> <br><br>

<a href="viewstudent.jsp"> View Student</a> <br><br>

<form action="logout" method="get">

<input type="submit" value="Logout"> <br><br>

</form>

</body>
</html>