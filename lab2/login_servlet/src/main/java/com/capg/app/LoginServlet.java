package com.capg.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pass = request.getParameter("password");

		if (username.equals("shivam") && pass.equals("shivam123")) {
			response.sendRedirect("Success.jsp");
		} else {
			response.sendRedirect("LoginForm.jsp?invalid=true");
		}
	}




}
