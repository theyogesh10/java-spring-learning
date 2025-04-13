package com.yogeshjava.sample.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yogeshjava.sample.entity.User;
import com.yogeshjava.sample.model.DbConnect;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer count = 0;
		String user = request.getParameter("userName");
		String pass = request.getParameter("password");
		User obj = new User(user, pass);
		DbConnect ref = new DbConnect();
		HttpSession ses = request.getSession();
		count = (Integer) ses.getAttribute("attempt");
		if(count==null) {
			count=0;
		}
		boolean result = ref.isValid(obj);
		if (result == true) {
			ses.setAttribute("loggedUser", user);
			response.sendRedirect("home.jsp");
		} 
		else if (count == 3) {
			ses.invalidate();
			response.sendRedirect("index.html");
		} 
		else {
			count++;
			ses.setAttribute("attempt", count);
			ses.setAttribute("loginError","Wrong username/password");
			System.out.println("Count is " + count);
			response.sendRedirect("login.jsp");
		}

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
