package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.User;

public interface TestInterFace {
	public int testInterFace();
	public User testUser();
	public int addUser(String username, String password);
	public List<User> getUserList();
	public List<User> findByName(String username);
}
