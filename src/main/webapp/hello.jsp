<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>hello</title>
</head>
<body>
<%
		String str = (String)request.getAttribute("param");
	%>
	<h2>dec9810 </h2>
	${requestScope.param }<br/>
	${message }


</body>
</html>