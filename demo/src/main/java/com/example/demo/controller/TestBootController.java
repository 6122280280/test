package com.example.demo.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.User;
import com.example.demo.service.TestInterFace;

@Controller
public class TestBootController {
	private final org.slf4j.Logger log = LoggerFactory.getLogger(TestBootController.class);
	@Autowired
	private TestInterFace testInterFace;
	@RequestMapping("/num")
	@ResponseBody
	public int home() {
		int i = testInterFace.testInterFace();
		return i;
	}
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		log.info("TestBootController getUser info");
		log.error("TestBootController getUser info");
		User user = testInterFace.testUser();
		return user;
	}
}
