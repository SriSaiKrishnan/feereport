<%@page import="com.fee.report.model.Student"%>
<%@page import="com.fee.report.service.impl.StudentServiceImpl"%>
<%@page import="com.fee.report.service.StudentService"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EditStudent</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("index.html");
	}
%>

<%
int counter = 0;
String studentid = null;
Integer studentId = 0;

 studentid = request.getParameter("studentid");
 System.out.println(studentid);
	 studentId = Integer.parseInt(studentid);
	counter++;
	StudentService service = new StudentServiceImpl();
	Student student = new Student();
	student.setId(studentId);
	student = service.viewStudentById(student);
%>


<form action="editstudent" method="post" >

Enter the ID: <input type="text" value=<%= request.getParameter("studentid") %>  name="id" id="id" > <br><br>

Enter the Name: <input type="text" value="<%=student.getName()%>" name="accountantname" id="accountantname" > <br><br>

Enter the Email: <input type="text" value="<%=student.getEmailID()%>" name="email" id="email"> <br><br>

Enter the Course: <input type="text" value="<%=student.getCourse()%>" name="course" id="course"> <br><br>

Enter the Fee: <input type="text" value="<%=student.getFee()%>" name="fee" id="fee"> <br><br>

Enter the Paid Amount: <input type="text" value="<%=student.getPaid()%>" name="paid" id="paid"> <br><br>

Enter the Due: <input type="text" value="<%=student.getDue()%>" name="due" id="due"> <br><br>

Enter the Address: <input type="text" value="<%=student.getAddress()%>" name="address" id="address"> <br><br>

Enter the City: <input type="text" value="<%=student.getCity()%>" name="city" id="city"> <br><br>

Enter the State: <input type="text" value="<%=student.getState()%>" name="state" id="state"> <br><br>

Enter the Country: <input type="text" value="<%=student.getCountry()%>" name="country" id="country"> <br><br>

Enter the Contact-No: <input type="text" value="<%=student.getContactNo()%>" name="contact_no" id="contact_no"> <br><br>

<input type="submit" value="Update Student"> 

 <button type="submit" formaction="searchstudent.jsp">Back</button>

</form>

</body>
</html>