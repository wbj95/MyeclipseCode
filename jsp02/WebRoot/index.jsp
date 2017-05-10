<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="1.jsp" method="post">
    	姓名：<input  type="text" name="username"><br>
    	性别:<input name="sex" type="radio" value="man">男
    	<input name="sex" type="radio" value="women">女
    	<br>
    	爱好：
    	<input name="love" type="checkbox" value="lol">LOL
    	<input name="love"  type="checkbox" value="CF">CF
    	<input name="love" type="checkbox" value="CS">CS
    	<input name="love" type="checkbox" value="QQ">QQ
    	<br>
    	战斗力:
    	<select name="zhandouli">
    		<option>5</option>
    		<option>231</option>
    		<option value="111">2423</option>
    		<option>5000</option>
    		
    	</select>
    	<br><br>
    	<input type="submit" value="提交">
    </form>
  </body>
</html>
