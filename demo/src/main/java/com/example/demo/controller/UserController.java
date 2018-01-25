package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.User;
import com.example.demo.service.TestInterFace;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private TestInterFace testInterFace;
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		return testInterFace.testUser();
	}
	@RequestMapping("/getNum")
	@ResponseBody
	public int num() {
		int i = testInterFace.testInterFace();
		return i;
	}
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser() {
		testInterFace.addUser("王凯旋", "123456");
		return "插入成功";
	}
	@RequestMapping("/getUserList")
	@ResponseBody
	public List<User> getUserList(){
		return testInterFace.getUserList();
	}
	@RequestMapping("/findByName")
	@ResponseBody
	public List<User> findByName(){
		return testInterFace.findByName("王凯旋");
	}
}
