<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	
  	<base href="<%=basePath%>>"> 
  	
    <title>registe</title>
	<style type="text/css">
	body{
	background-color: #E8FBFF;
	color: #A6B;
	background-image: url("res/login-bg.jpg");
	background-repeat: no-repeat;
	}overflow-y: scroll;
	</style>
  </head>
  
  <body>
    <h1 align="center">用户注册</h1>
    <div align="center">
    ${error }
    <form action="zhuCe.action" method="post">
    	登录名:<input type="text" name="username"><br><br>
    	密码:&nbsp;<input type="password" name="password"><br><br>
    	<input type="submit" value="注册">
    	
    </form>
    </div>
  </body>
</html>
