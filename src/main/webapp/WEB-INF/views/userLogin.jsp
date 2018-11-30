<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.sp.vo.UserVO"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<script src="/resources/AjaxUtil.js"></script>
</head>

<body>
<div id="div" style="width:400px;height:100px;border:1px solid black;">
아이디 : <input id="id" type="text"><br>
비밀번호  : <input id="pwd" type="password"><br>
<button id="btn">로그인</button><a href="/uri/userCheck">다른페이지 이동</a>
</div>
<script>
	var au = new AjaxUtil();
	var btn = document.querySelector('#btn');
	function login(){
		alert('sss');
		var id = document.querySelector('#id');
		var pwd = document.querySelector('#pwd');
		var conf = {
				url:'/user',
				method:'POST',
				param:JSON.stringify({
					id:id.value, pwd:pwd.value
				}),
				success:function(res){
					res = JSON.parse(res);
					if(res != null){
						alert('로그인하였습니다');
					}else{
						alert('실패');
					}
				}
		}
		au.send(conf);
	}
	btn.addEventListener('click',login);
	
</script>
</body>
</html>