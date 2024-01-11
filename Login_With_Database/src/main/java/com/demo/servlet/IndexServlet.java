package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public IndexServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("Index.html");
		rd.forward(req, res);
	}

}
