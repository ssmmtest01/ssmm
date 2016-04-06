<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>sprint hello</title>
</head>
<body>
	<%
		String str = (String) request.getAttribute("param");
	%>	
	${requestScope.param }!
</body>
</html>