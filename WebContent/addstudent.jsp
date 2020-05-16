<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addstudent</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("index.html");
	}
%>

<form action="addstudent" method="post">

Enter the Name: <input type="text" name="accountantname" id="accountantid"> <br><br>

Enter the Email: <input type="text" name="email" id="email"> <br><br>

Enter the Course: <input type="text" name="course" id="course"> <br><br>

Enter the Fee: <input type="text" name="fee" id="fee"> <br><br>

Enter the Paid Amount: <input type="text" name="paid" id="paid"> <br><br>

Enter the Due: <input type="text" name="due" id="due"> <br><br>

Enter the Address: <input type="text" name="address" id="address"> <br><br>

Enter the City: <input type="text" name="city" id="city"> <br><br>

Enter the State: <input type="text" name="state" id="state"> <br><br>

Enter the Country: <input type="text" name="country" id="country"> <br><br>

Enter the Contact-No: <input type="text" name="contact_no" id="contact_no"> <br><br>

<input type="submit" value="Add Student"> 

</form>

</body>
</html>