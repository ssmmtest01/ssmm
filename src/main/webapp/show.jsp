<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% 
		String host = (String)request.getAttribute("host");
	%>
	<%=host %>
	${requestScope.host }
</body>
</html>