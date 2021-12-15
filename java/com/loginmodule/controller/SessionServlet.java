package com.loginmodule.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginmodule.model.LoginBean;


@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Homepage.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		
		
		LoginBean lb = new LoginBean(uname, pword);
		
		if(lb.getName().equals("unknown") && lb.getPassword().equals("unknown")) {
			response.sendRedirect("Login.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(10);			
			session.setAttribute("Signed-in", "true");
			session.setAttribute("username", lb.getName());
			RequestDispatcher rd = request.getRequestDispatcher("Homepage.jsp");
			rd.forward(request, response);
		}
	}

}
