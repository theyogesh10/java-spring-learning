package com.yogeshjava.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
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
	
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("get");
		String user = req.getParameter("userName"); 
		String pass = req.getParameter("password"); 
		
		UserVerification object = new UserVerification();
		boolean result = object.isValid(user, pass);
		PrintWriter out = res.getWriter();
		if(result==true) {
			out.println("Valid");
		}
		else {
			out.println("Invalid");
		}
		
		out.println("<h1 style='color:red'>Hello World through Servlet</h1>");
		System.out.println(user + " " + pass);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("post");
	}
	

}
