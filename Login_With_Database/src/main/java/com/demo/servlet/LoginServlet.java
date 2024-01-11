package com.demo.servlet;
import com.demo.services.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.beans.*;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserServices usrvc = new UserServicesImpl();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		User u = new User(uname, pass);
		
		if(usrvc.login(u)) {
			RequestDispatcher rd = req.getRequestDispatcher("Welcome.html");
			rd.forward(req, res);
		}
		else {
			req.getRequestDispatcher("Login.html").include(req, res);
		}
	}

}
