<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  <title>要租房，上淘宝！~</title>
	<script type="text/javascript" src="jquery-1.8.0.min.js"></script>
	
	<script type="text/javascript">
		function fanYe(ym){
			document.getElementById("dq").value=ym;
			
			document.getElementById("f1").submit();
		}	
	</script>
  </head>
  
  <body>
  
  <div align="center">
   	<form action="souSuo.action" method="post">
   		标题<input type="text" name="house.title"> 
   		<input type="submit" value="搜索">
   		价格<select name="price">
   			<option value="0">请选择</option>
   			<option value="1">500-1500</option>
   			<option value="2">1501-2500</option>
   			<option value="3">2500以上</option>
   		</select>
   			
   		面积<select name="floorage">
   			<option value="0">请选择</option>
   			<option value="1">30-50</option>
   			<option value="2">50-80</option>
   			<option value="3">80以上</option>		
   		</select>
   	</form>
   	</div>
   	<br><br>
   	 <div align="center">
  	<s:iterator value="list" id="h" status="s">
  		${h.title } &nbsp;&nbsp;&nbsp; ${h.street.name } &nbsp;&nbsp;&nbsp; ${h.street.district.name }
  		&nbsp;&nbsp;&nbsp;<a href="quXiuGai.action?house.id=${h.id }">修改</a> 
  		&nbsp;&nbsp;&nbsp;<a href="delete.action?house.id=${h.id }">删除</a>
  		
  		<br><hr><br>
  		
  	</s:iterator>
    	&nbsp;
    	<a href="#" onclick="fanYe(1)">首页</a>
    	&nbsp;
   		
    		<a href="#" onclick="fanYe(${zongYe})">末页</a>	&nbsp;
    		共${zongJiLu }条&nbsp;第${dangQianYe}页/共${zongYe }页&nbsp;
    		
    	<s:if test="dangQianYe!=1">
    		<a href="#" onclick="fanYe(${dangQianYe-1})">上一页</a>&nbsp;
    	</s:if>
    	<s:if test="dangQianYe!=zongYe">
    		<a href="#" onclick="fanYe(${dangQianYe+1})">下一页</a>&nbsp;
    	</s:if>
 	</div>
   
   <br><br>
   <div align="center">
   <form action="souSuo.action" method="post" id="f1">
   	标题<input type="text" name="house.title" value="${house.title}">
   	价格<input type="text" name="price" value="${price }"> 
   	面积<input type="text" name="floorage" value="${floorage}"> 
   	当前页<input type="text" name="dangQianYe" id="dq" value="${dangQianYe }"> 
   	</div>
   </form>
   
  </body>

</html>
