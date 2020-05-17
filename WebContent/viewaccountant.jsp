<%@page import="com.fee.report.service.impl.AccountantServiceImpl"%>
<%@page import="com.fee.report.service.AccountantService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ViewAccountant</title>
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
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM accountant;
    </sql:query>

 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Accountant</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>contact-No</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.emailid}" /></td>
                    <td><c:out value="${user.contact_no}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    
    <br><br><a  href="admin.jsp">Back</a>

</body>
</html>