package com.bookapp.bookdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.book.Book;
import com.bookapp.util.ConnectionUtil;

public class BookDAO {
	public void addbook(Book book) throws Exception {
		Connection connection = Connectionutil.getConnection();
		String sql = "insert into books values(?,?,?)";
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, book.getId());
		pst.setString(2, book.getName());
		pst.setFloat(3, book.getPrice());
		pst.executeUpdate();

	}

	
	public void UpdatePrice(Book book)throws Exception{
		Connection connection=ConnectionUtil.getConnection();
		String sql=("update books set price=?where name=?");
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setFloat(1, book.getPrice());
		pst.setString(2, book.getName());
		pst.executeUpdate();
	}
	public void Delete(Book book)throws Exception{
		Connection connection=ConnectionUtil.getConnection();
		String sql=("delete from books where name=? ");
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1, book.getName());
		pst.executeUpdate();
	}
	public List<Book> ViewALL() throws Exception{
		Connection connection=ConnectionUtil.getConnection();
		String sql=("select id,name,price from books");
		PreparedStatement pst=connection.prepareStatement(sql);
	ResultSet rs=pst.executeQuery();
	List<Book>books=new ArrayList<>();
	while(rs.next()){
		Book book=new Book();
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setPrice(rs.getFloat(3));
		books.add(book);
		
	}
	return books;
	}
	public List<Book> ViewByName1(Book book) throws Exception{
		Connection connection=ConnectionUtil.getConnection();
		String sql=("select id,name,price from users where name=?");
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1, book.getName());
	ResultSet rs=pst.executeQuery();
	List<Book>books=new ArrayList<>();
	if(rs.next()){
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setPrice(rs.getFloat(3));
		books.add(book);
		
	}
	return books;
	}



	
		
	}


