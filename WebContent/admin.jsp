<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("index.html");
	}
%>

<a href="addaccountant.jsp"> Add Accountant</a> <br><br>

<a href="viewaccountant.jsp"> View Accountant</a> <br><br>

<form action="logout" method="get">

<input type="submit" value="Logout"> <br><br>

</form>

</body>
</html>