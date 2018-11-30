package com.test.sp.vo;

import org.springframework.stereotype.Component;

@Component
public class UserVO {

	private Integer num;
	private String id;
	private String pwd;
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserVO [num=" + num + ", id=" + id + ", pwd=" + pwd + "]";
	}
	
	
}
