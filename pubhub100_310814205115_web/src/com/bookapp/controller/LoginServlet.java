package com.bookapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.Model.User;
import com.bookapp.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setEmail(email);
		String passsword = null;
		user.setPassword(passsword);
	
		UserDAO userdao = new UserDAO();
		try {
			userdao.login(user);
			response.sendRedirect("success.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.sendRedirect("failure.jsp");
			e.printStackTrace();	}
	}
	}


