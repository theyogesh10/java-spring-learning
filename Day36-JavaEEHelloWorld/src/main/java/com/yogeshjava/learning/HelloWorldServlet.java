package com.yogeshjava.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String user = req.getParameter("userName");
		String pass = req.getParameter("password");
		PrintWriter out = res.getWriter();
		out.println("<h1 style='color:red'>Hello World through Servlet</h1>");
		System.out.println(user + " " + pass);
	}

}
