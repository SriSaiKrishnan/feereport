<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddAccountant</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>


<form name = "AddAcc" action= "AddAccountant" method=  "post">

Enter the Name: <input type="text" name="accountantname" > <br><br>

Enter the Password: <input type="password" name="accountantpassword" > <br><br>

Enter the Email: <input type="text" name="email" > <br><br>

Enter the Contant_No: <input type="text" name="contactno" > <br><br>

<input type="submit" value="Add Accountant">

 <button type="submit" formaction="admin.jsp">Back</button>

</form> 

</body>
</html>