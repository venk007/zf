<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
    <title>My JSP 'xiugai.jsp' starting page</title>
    
  </head>
  
  <body>
  <s:fielderror ></s:fielderror>
  
  <s:form action="faBu" method="post" namespace="/">
    		标题<s:textfield label="标题" name="house.title"></s:textfield> <br>
			户型<s:select label="户型" list='#{"1000":"一室一厅","1002":"两室一厅"}' name="house.type.id"></s:select> <br>    	
    		面积<s:textfield label="面积" name="house.floorage"></s:textfield> <br>
    		价格<s:textfield label="价格" name="house.price"></s:textfield> <br>
    		日期<s:textfield label="日期" name="house.pubdate"></s:textfield> <br>
    		位置:<s:select label="区" list='#{"1004":"海淀","1002":"西城" }' name="qid"></s:select> <br>
    			<s:select label="街" list='#{"1000":"知春路","1001":"中关村大街" }' name="house.street.id"></s:select> <br>
    		
    		电话<s:textfield label="电话" name="house.contact"></s:textfield> <br>
    		详细信息<s:textarea label="详细信息" cols="10" rows="10" name="house.description"></s:textarea> <br>
    		<s:hidden name="house.id"></s:hidden>
    		
    		<s:submit label="发布" value="修改"></s:submit>
    	</s:form>
   
  </body>
</html>