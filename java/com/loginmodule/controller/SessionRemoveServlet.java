package com.loginmodule.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionRemoveServlet
 */
@WebServlet("/SessionRemoveServlet")
public class SessionRemoveServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("Signed-in");
		session.invalidate();
		response.sendRedirect("Login.jsp");
	}




}

