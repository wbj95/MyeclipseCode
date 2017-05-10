<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
	request.setCharacterEncoding("utf-8");
 %>
<jsp:useBean id="loginUser" class="com.po.Users" scope="page"/>
<jsp:useBean id="userDao" class="com.dao.UsersDao" scope="page"/>
<<jsp:setProperty property="*" name="loginUser"/>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


if(userDao.userLogin(loginUser))
{
	session.setAttribute("LoginUser", loginUser.getUsername());
	request.getRequestDispatcher("login_success.jsp").forward(request, response);
}
else{
	response.sendRedirect("login_failure.jsp");
}
%>
