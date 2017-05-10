<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

  </head>
  
  <body>
    <form action="dologin.jsp" method="post">
    	<label>用户名：</label>
    	<input name="username" value="">
    	<label>密码：</label>
    	<input name="password" type="password" value="">
    	<input type="submit" value="登录" > 
    </form>
  </body>
</html>
