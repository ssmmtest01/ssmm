<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>success page</h2>
	time: ${requestScope.time }
	names:${requestScope.names}
	<br><br>
	request user:${requestScope.user }
	session user:${sessionScope.user }
	<br><br>
	request name:${requestScope.name }
	session name:${sessionScope.name }
</body>
</html>