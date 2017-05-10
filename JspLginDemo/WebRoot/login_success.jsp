<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

  </head>
  
  <body>
  <%
  	String loginUser="";
  	if(session.getAttribute("LoginUser")!="")
  	{
  		loginUser=session.getAttribute("LoginUser").toString();
  	}
   %>
	欢迎您<font color="red"><%=loginUser %></font>，登录成功；
  </body>
</html>
