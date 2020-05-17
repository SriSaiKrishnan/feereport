/**
 * 
 */
package com.fee.report.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * @author sv
 *
 */
public class LogoutController extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("uname");
		httpSession.invalidate();
		response.sendRedirect("index.html");
	}

}
