/**
 * 
 */
package com.fee.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fee.report.model.Student;
import com.fee.report.service.StudentService;
import com.fee.report.service.impl.StudentServiceImpl;

/**
 * @author sv
 *
 */
public class EditStudentController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		StudentService studentService  = new StudentServiceImpl();
		student.setName(request.getParameter("accountantname"));
		student.setEmailID(request.getParameter("email"));
		student.setCourse(request.getParameter("course"));
		student.setFee(Integer.parseInt(request.getParameter("fee")));
		student.setPaid(Integer.parseInt(request.getParameter("paid")));
		student.setDue(Integer.parseInt(request.getParameter("due")));
		student.setAddress(request.getParameter("address"));
		student.setCity(request.getParameter("city"));
		student.setState(request.getParameter("state"));
		student.setCountry(request.getParameter("country"));
		student.setContactNo(Long.parseLong(request.getParameter("contact_no")));
		student.setId(1);
		studentService.editStudent(student);
		
		response.sendRedirect("editstudent.jsp");
	}
}
