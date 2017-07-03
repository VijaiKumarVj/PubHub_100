package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookapp.Model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	public void register(User user)throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query = "insert into user (name,email,password) values(?,?,?);";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.executeUpdate();
}
	public boolean login (User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		String sql=("select email,password from user where email=? and password=?;");
		PreparedStatement pst  = connection.prepareStatement(sql);
		pst.setString(1, user.getEmail());
		pst.setString(2, user.getPassword());
		ResultSet rs= pst.executeQuery();
		boolean flag = false;
		if(rs.next())
			flag = true;
	
	 return flag;
}}