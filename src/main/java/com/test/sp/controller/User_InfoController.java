package com.test.sp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.User_InfoService;
import com.test.sp.vo.UserVO;

@Controller
public class User_InfoController {

	@Autowired
	private User_InfoService us;
	
	@PostMapping("/user")
	public @ResponseBody UserVO userLogin(@RequestBody UserVO user,HttpServletRequest request){
		UserVO users = us.userLogin(user);
		return users;
	}
}
