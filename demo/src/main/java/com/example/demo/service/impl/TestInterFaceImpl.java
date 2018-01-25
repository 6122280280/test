package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.TestInterFace;

@Service
public class TestInterFaceImpl implements TestInterFace{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public int testInterFace() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User testUser() {
		// TODO Auto-generated method stub
		User user = new User();
		
		return user;
	}

	@Override
	public int addUser(String username, String password) {
		
		return userDao.addUser(username, password);
	}

	@Override
	public List<User> getUserList() {
		
		return userDao.getUserList();
	}

	@Override
	public List<User> findByName(String username) {
	
		return userDao.findByName(username);
	}

}
