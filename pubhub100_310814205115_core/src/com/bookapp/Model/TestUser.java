package com.bookapp.Model;

public class TestUser {
	public static void main(String[] args) {
	// TODO Auto-generated constructor stub
	User user = new User();
	user.setId(1);
	user.setName("Vijai");
	user.setEmail("vijai@gmail.com");
	user.setPassword("123");
	user.setActive(1);
	System.out.println(user);
	
}

}
