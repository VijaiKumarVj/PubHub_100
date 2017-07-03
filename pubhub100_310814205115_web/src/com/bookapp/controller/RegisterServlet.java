package com.bookapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bookapp.Model.User;
import com.bookapp.dao.UserDAO;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setEmail( request.getParameter("email"));
		user.setPassword( request.getParameter("pass"));
		UserDAO dao = new UserDAO();
		try {
		dao.register(user);
		RequestDispatcher rs= request.getRequestDispatcher("login.jsp");
		rs.forward(request, response);
				}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	}




