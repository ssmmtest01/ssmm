<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty requestScope.employees }">
		没有任何员工信息.
	</c:if>
	<c:if test="${!empty requestScope.employees }">
		<table>
			<tr>
				<th>id</th>
				<th>lastname</th>
				<th>email</th>
				<th>gender</th>
				<th>department</th>
				<th>edit</th>
				<th>delete</th>
			</tr>
			<!--  
			<c:forEach items="${requestScope.employees }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.lastname }</td>
					<td>${emp.email }</td>
					<td>${emp.gender }</td>
					<td>${emp.department }</td>
					<td><a href="">edit</a></td>
					<td><a href="">delete</a></td>
				</tr>
			</c:forEach>-->
			<c:forEach items="${requestScope.employees }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email }</td>
					<td>${emp.gender == 0 ? 'Female' : 'Male' }</td>
					<td>${emp.department.departmentName }</td>
					<td><a href="emp/${emp.id}">Edit</a></td>
					<td><a class="delete" href="emp/${emp.id}">Delete</a></td>
				</tr>
			</c:forEach>
			
		</table>
	</c:if>
</body>
</html>