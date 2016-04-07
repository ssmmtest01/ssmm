<html>
<body>

	<%
		String str = (String)request.getAttribute("param");
	%>
	
	<%=str %><br/>
	${requestScope.param }
</body>
</html>
