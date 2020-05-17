<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Student</title>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("index.html");
	}
%>


    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/fee_report"
        user="root" password="mysqladmin"
    />
     
    <sql:query var="listStudents"   dataSource="${myDS}">
        SELECT * FROM student;
    </sql:query>

 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Students</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Course</th>
                <th>Fee</th>
                <th>Paid</th>
                <th>Due</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Country</th>
                <th>contact-No</th>
            </tr>
            <c:forEach var="students" items="${listStudents.rows}">
                <tr>
                    <td><c:out value="${students.id}" /></td>
                    <td><c:out value="${students.name}" /></td>
                    <td><c:out value="${students.emailid}" /></td>
                    <td><c:out value="${students.course}" /></td>
                    <td><c:out value="${students.fee}" /></td>
                    <td><c:out value="${students.paid}" /></td>
                    <td><c:out value="${students.due}" /></td>
                    <td><c:out value="${students.address}" /></td>
                    <td><c:out value="${students.city}" /></td>
                    <td><c:out value="${students.state}" /></td>
                    <td><c:out value="${students.country}" /></td>
                    <td><c:out value="${students.contact_no}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>