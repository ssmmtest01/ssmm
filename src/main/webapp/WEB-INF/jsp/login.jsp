<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
	<form action="login.jsp">
		<input type="text" name="user"/>
		<input type="text" name="pwd"/>
		<input type="submit" value="提交"/>
	</form>
	<font color="red">${error }</font>
</body>
</html>