<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<center>
<body>
  <table border="1px" cellpadding="0" cellspacing="0" style="width:200px ;height:100px">
    <caption>学生信息</caption>
    <thead>
      <th>学号</th>
      <th>姓名</th>
      <th>年龄</th>
      <th>性别</th>
    </thead>
    <tbody >
      <c:forEach items="${list}"  var="item">
       <tr>
         <td >${item.id }</td>
         <td>${item.age }</td>
         <td>${item.name}</td>
         <td>${item.gender}</td>
       </tr>
       </c:forEach>
    
    </tbody>
  </table>
</body>
<center>
</html>
