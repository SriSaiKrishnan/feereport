package com.fee.report.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fee.report.model.Accountant;
import com.fee.report.service.AccountantService;
import com.fee.report.service.impl.AccountantServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		accountant.setName(name);
		accountant.setPassword(password);
		if(name.equalsIgnoreCase("admin")&&password.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			response.sendRedirect("admin.jsp");
		}else if(accountantService.userCheck(accountant)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			response.sendRedirect("accountant.jsp");
		}else {
			response.sendRedirect("index.html");
		}
	}

}
