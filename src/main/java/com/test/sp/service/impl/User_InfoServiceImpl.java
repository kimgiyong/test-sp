package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.User_InfoDAO;
import com.test.sp.service.User_InfoService;
import com.test.sp.vo.UserVO;

@Service
public class User_InfoServiceImpl implements User_InfoService {

	@Autowired
	private User_InfoDAO ud;
	
	@Override
	public UserVO userLogin(UserVO user) {
		return ud.userLogin(user);
	}

}
