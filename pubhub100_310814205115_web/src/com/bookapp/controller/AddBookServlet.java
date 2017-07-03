package com.bookapp.controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.book.Book;
import com.bookapp.bookdao.BookDAO;



@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//int id = Integer.parseInt(i);
		String i=request.getParameter("id");
 		int id=Integer.parseInt(i);
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		//String authorName = request.getParameter("authorName");
		Book book = new Book();
		book.setName(name);
		book.setId(id);
		book.setPrice(Integer.parseInt(price));
		
		BookDAO dao = new BookDAO();
		try {
			dao.addbook(book);
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
