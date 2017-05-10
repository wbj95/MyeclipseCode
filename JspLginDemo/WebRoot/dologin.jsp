<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String username="";
String password="";
request.setCharacterEncoding("utf-8");//防止中文乱码
username=request.getParameter("username");
password=request.getParameter("password");

if("admin".equals(username)&&"admin".equals(password))
{
	session.setAttribute("LoginUser", username);
	request.getRequestDispatcher("login_success.jsp").forward(request, response);
}
else{
	response.sendRedirect("login_failure.jsp");
}
%>
