<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String) session.getAttribute("name");
	%>
	<h3>
		Welcome :<%=name%></h3>
	<a href="profile.jsp">profile</a> &nbsp;&nbsp;
	<a href="About us.jsp">About us</a>
</body>
</html>