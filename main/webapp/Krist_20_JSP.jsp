<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="Krist_21.jsp"%>

<%
	
	String name = request.getParameter("name");

	if(name == null) {
		name = "Hello world";
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Krist Company</h1>
	<hr />

	<div>
		Welcome,
		<%=name%>
		<hr />
		Lottery :
		<%
				out.print((int) (Math.random() * 49 + 1));
				%>
	</div>

	<hr />

	<%
			HashSet<Integer> set = new HashSet<>();
			while (set.size() < 6) {
				set.add((int) (Math.random() * 49 + 1));
			}

			out.print(set);
			%>



</body>
</html>