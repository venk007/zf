<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
	<title>login</title>
	<style type="text/css">
	body{
	background-color: #E8FBFF;
	color: #A6B;
	background-image: url("/zf/src/res/login-bg.jpg");
	background-repeat: no-repeat;
	}overflow-y: scroll;
	</style>
	
	
</head>

	<body>
	<br>
	<div align="center">
	${error}
		<form action="login.action" method="post">
			<s:text name="loginName"/><input type="text" name="username"><br><br>
			<s:text name="password"/>&nbsp;<input type="password" name="password"><br><br>
			
			<input type="submit" value="登录">&nbsp;
			<input type="button" onclick="href=goZhuCe.action" value="注册">
			<!-- <a href="goZhuCe.action">注册</a> -->
		</form>
	</div>
	</body>
</html>
