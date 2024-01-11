package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		if(uname.equals("Admin") && pass.equals("admin@123"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("Login.html").include(req, res);
			out.print("<html><body>");
			out.print("<div align = 'center'><h4>Wrong Credentials !</h4><div>");
			out.print("</body></html>");
		}
	}
}
