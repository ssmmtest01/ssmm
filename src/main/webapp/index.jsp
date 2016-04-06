<html>
<body>
	<h1>hello </h1>
	<%
		String str = (String)request.getAttribute("param");
	%>
	
	<%=str %>
	${requestScope.param }
</body>
</html>
