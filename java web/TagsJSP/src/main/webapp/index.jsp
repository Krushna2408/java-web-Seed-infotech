<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int a = 10;

	String name = "python";

	int mul() {
		return a * a;
	}%>
	<%
	out.print("a ="+a);
	out.print("Name ="+name);
	out.print(mul());
	int b=10;
	
	if (b>100)
	{
		out.print("b is greater");
	}
	else
	{
		out.print("b is smaller");
	}
	%>
</body>
</html>