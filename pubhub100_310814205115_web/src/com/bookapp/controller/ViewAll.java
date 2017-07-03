package com.bookapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.book.Book;
import com.bookapp.bookdao.BookDAO;

@WebServlet("/ViewAll")
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());

		BookDAO b=new BookDAO();

		try{
			List<Book> book1 = b.ViewALL();

			RequestDispatcher dispatcher = request.getRequestDispatcher("viewall.jsp");
			request.setAttribute("list1", book1);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
}
