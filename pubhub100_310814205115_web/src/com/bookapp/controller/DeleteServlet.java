package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.book.Book;
import com.bookapp.bookdao.BookDAO;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String p=request.getParameter("id");
		int id=Integer.parseInt(p);
		Book book=new Book();
		book.setId(id);
		BookDAO dao=new BookDAO();
		try {
			dao.Delete(book);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}}