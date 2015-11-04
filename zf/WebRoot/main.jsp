<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>main.jsp</title>

  </head>
  
  <body>
    <a href="goFaBu.action">发布房屋信息</a>
    <br><br><br>
    <div align="center">
  	<s:iterator value="list" id="h" status="s">
  		${h.title } &nbsp;&nbsp;&nbsp; ${h.street.name } &nbsp;&nbsp;&nbsp; ${h.street.district.name }
  		&nbsp;&nbsp;&nbsp;<a href="quXiuGai.action?house.id=${h.id }">修改</a> 
  		&nbsp;&nbsp;&nbsp;<a href="delete.action?house.id=${h.id }">删除</a>
  		
  		<br><hr><br>
  		
  	</s:iterator>
    	&nbsp;
    	<a href="fenYe.action?dangQianYe=1">首页</a>
    	&nbsp;|&nbsp;
   		<s:if test="dangQianYe!=1">
    		<a href="fenYe.action?dangQianYe=${dangQianYe-1}">上一页</a>	&nbsp;|&nbsp;
    	</s:if>
    	<s:if test="dangQianYe==1">
    		<a >上一页</a>&nbsp;|&nbsp;
    	</s:if>
    	<s:if test="dangQianYe!=zongYe">
    		<a href="fenYe.action?dangQianYe=${dangQianYe+1}">下一页</a>&nbsp;|&nbsp;
    	</s:if>
    	<s:if test="dangQianYe==zongYe">
    		<a >下一页</a>&nbsp;|&nbsp;
    	</s:if>
    	<a href="fenYe.action?dangQianYe=${zongYe}">末页</a>
    	&nbsp;|&nbsp; 第 ${dangQianYe } 页 / 共 ${zongYe } 页
 	</div>
  </body>
</html>