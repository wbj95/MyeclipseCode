<%@ page language="java"  pageEncoding="UTF-8"%>

<html>
  <head>
    
    
    <title>嵌入脚本代码</title>
    
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
   <%
   int a=10;
   //System.out.println(a);在页面没有效果
   out.println(a);
   String name="weiwei";
    %>
    <%-- --%>
    <%=name %>
  </body>
</html>
