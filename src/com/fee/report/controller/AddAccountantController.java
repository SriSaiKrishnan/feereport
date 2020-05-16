package com.fee.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fee.report.model.Accountant;
import com.fee.report.service.AccountantService;
import com.fee.report.service.impl.AccountantServiceImpl;

/**
 * Servlet implementation class AddAccountantController
 */
public class AddAccountantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAccountantController() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Accountant accountant = new Accountant();
		AccountantService accountantService = new AccountantServiceImpl();
		String name = request.getParameter("accountantname").toString();
		String password = request.getParameter("accountantpassword").toString();
		String email = request.getParameter("email").toString();
		long contact_No = Long.parseLong(request.getParameter("contactno"));
		accountant.setName(name);
		accountant.setPassword(password);
		accountant.setEmailID(email);
		accountant.setContactNo(contact_No);
		accountantService.addAccountant(accountant);
		
		response.sendRedirect("admin.jsp");
	}

}
