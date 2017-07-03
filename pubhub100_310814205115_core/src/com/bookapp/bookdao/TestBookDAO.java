package com.bookapp.bookdao;

import com.bookapp.book.Book;

public class TestBookDAO {
	public static void main(String[] args) throws Exception {
		Book book=new Book();
		book.setId(1);
		book.setName("c++");
	     book.setPrice(1000);
				
		BookDAO bookdao=new BookDAO();
	
		System.out.println(book);
	}


}
