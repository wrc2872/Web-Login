/**
 * 
 */
package com.wrc.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 *
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		  String password = req.getParameter("password");

		  if (name.equalsIgnoreCase("wrc") && password.equalsIgnoreCase("123"))
		  {
			  req.setAttribute("name", "wrc");
			  req.getRequestDispatcher("/loginSuccess.jsp").forward(req, resp);
		  }
		  else
			  req.getRequestDispatcher("/loginFailure.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	
	
}
