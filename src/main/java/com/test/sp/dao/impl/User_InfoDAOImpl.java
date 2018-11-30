package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.User_InfoDAO;
import com.test.sp.vo.UserVO;

@Repository
public class User_InfoDAOImpl implements User_InfoDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public UserVO userLogin(UserVO user) {
		return ss.selectOne("com.test.sp.USER.userLogin",user);
	}
	

}
