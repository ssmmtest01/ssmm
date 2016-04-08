<html>
<body>
hhhhah
	<%
		String str = (String)request.getAttribute("param");
		String str2 = (String)request.getAttribute("param2");
		String str3 = (String)request.getAttribute("a");

	%>
	
	param=<%=str %>
	param2=<%=str2 %>
	a=<%=str3 %>
	${requestScope.param }
</body>
</html>
