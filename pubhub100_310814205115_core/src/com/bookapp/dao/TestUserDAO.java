package com.bookapp.dao;

import com.bookapp.Model.User;

public class TestUserDAO {
public static void main(String[] args )throws Exception{
	User user = new User();
	user.setName("Vijai");
	user.setEmail("vijai@gmail.com");
	user.setPassword("123");
	user.setActive(1);
	UserDAO dao = new UserDAO();
	dao.register(user);
	//dao.login(user);
}

}
