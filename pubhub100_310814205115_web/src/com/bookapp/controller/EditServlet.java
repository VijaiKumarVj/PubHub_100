package com.bookapp.controller;

import java.awt.print.Book;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String i=request.getParameter("id");
 		int id=Integer.parseInt(i);
 		String pri=request.getParameter("price");
 		int price=Integer.parseInt(pri);
 		Book book=new Book();
 		book.setName(name);
 		book.setPrice(Float.parseFloat(pri));
 		BookDAO dao=new BookDAO();	
 		try {
			dao.update(book); 
			response.sendRedirect("ModifyByPrice.jsp");
		}
 		catch (ClassNotFoundException e)
 		{
 			e.printStackTrace();
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
     }
}
	


