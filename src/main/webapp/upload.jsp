<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 >测试上传文件</h1>
<form action="upload.do" method="post" enctype="multipart/form-data">

<table>
<tr><td><input type="text" name="name"></td></tr>
<tr><td><input type="file" name="file"></td></tr>
<tr><td><input type="submit" value="提交"></td></tr>
<tr></tr>



</table>


</form>
</body>
</html>