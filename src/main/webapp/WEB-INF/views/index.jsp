<html>
<body>
	<%
		String str = (String)request.getAttribute("param");
	%>
	
	<%=str %>
	${requestScope.param }
</body>
</html>
