package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.beans.*;
import com.demo.services.UserServices;
import com.demo.services.UserServicesImpl;

@WebServlet("/ForgotPass")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ForgotServlet() {
        super();
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserServices usrvc = new UserServicesImpl();
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		User u = new User(null, pass, email);
		if(usrvc.forgotPass(u)) {
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.forward(req, res);
		}
		else {
			req.getRequestDispatcher("Forgotpass.html").include(req, res);
		}
		
	}

}
