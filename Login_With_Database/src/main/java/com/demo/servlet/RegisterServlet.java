package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.User;
import com.demo.services.UserServices;
import com.demo.services.UserServicesImpl;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterServlet() {
        super();
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserServices usrvc = new UserServicesImpl();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		User u = new User(uname, pass, email);
		
		if(usrvc.register(u)) {
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.forward(req, res);
		}
		else {
			req.getRequestDispatcher("Register.html").include(req, res);
		}
	}
}
