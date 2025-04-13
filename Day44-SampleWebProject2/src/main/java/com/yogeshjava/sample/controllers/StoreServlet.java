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
 * Servlet implementation class StoreServlet
 */
@WebServlet("/register")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("userName");
		String pass=request.getParameter("password");
		User obj=new User(user,pass);
		DbConnect ref=new DbConnect();
		HttpSession ses=request.getSession();
		boolean result= ref.registerUser(obj);
		if(result) {
			response.sendRedirect("login.jsp");
		}
		else {
			ses.setAttribute("registerError","Registration failed!");
			response.sendRedirect("register.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
