<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>发布房屋信息</title>
    <script type="text/javascript" src="jquery-1.8.0.min.js"></script>
    <script type="text/javascript">
    $(function(){
		$("#qu").bind("change",function(){
			$.post(
			"ld.action",
			{"quId":$(this).val()},
			function(data){
			$("#jd").html('<option value="0">请选择</option>');
			for (var i = 0;i < data.length; i++){
				$("#jd").append('<option value=\"'+data[i].id+'">'+data[i].name+'</option>');
				}
			},
			"json"
			);
		});    
    });
    
	</script>
  </head>
  
  <body>
  <!-- <s:fielderror fieldName="title"></s:fielderror>     -->
  		
    	<s:form action="faBu" method="post" namespace="/">
    		标题<s:textfield label="标题" name="house.title"></s:textfield> <br>
			户型<s:select label="户型" list='#{"1000":"一室一厅","1002":"两室一厅"}' name="house.type.id"></s:select> <br>    	
    		面积<s:textfield label="面积" name="house.floorage"></s:textfield> <br>
    		价格<s:textfield label="价格" name="house.price"></s:textfield> <br>
    		日期<s:textfield label="日期" name="house.pubdate"></s:textfield> <br>
    		位置:<s:select label="区" list='#map' name="qid" id="qu"></s:select> <br>
    			<s:select label="街" list='#{"0":"请选择"}' name="house.street.id" id="jd"></s:select> <br>
    		电话<s:textfield label="电话" name="house.contact"></s:textfield> <br>
    		详细信息<s:textarea label="详细信息" cols="10" rows="10" name="house.description"></s:textarea> <br>
    		发布<s:submit label="发布" value="发布"></s:submit>
    	</s:form>
  </body>
</html>