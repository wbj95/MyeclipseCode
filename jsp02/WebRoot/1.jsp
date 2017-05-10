<%@ page language="java"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP '1.jsp' starting page</title>
    
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
    	request.setCharacterEncoding("UTF-8");
    	//姓名
    	String username = request.getParameter("username");
    	//性别
    	String sex= request.getParameter("sex");
    	//爱好
    	//String love = request.getParameter("love");
    	
    	String []love=request.getParameterValues("love");
    	
    	String zhan = request.getParameter("zhandouli");
     %>
     <h1>姓名:<%=username %></h1>
     <h1>性别:<%=sex %></h1>
     <h1>爱好:<%
     	
     	for(int i=0;i<love.length;i++){
     		out.print(love[i]+" ");
     	}
     	
      %></h1>
     <h1>战斗力:<%=zhan %></h1>
     
  </body>
</html>
