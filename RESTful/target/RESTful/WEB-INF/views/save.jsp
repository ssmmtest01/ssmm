<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath }/emp" method="POST"  modelAttribute="employee">
		<c:if test="${employee.id == null}">
			LastName:<from:input path="lastName" /> <br>
		</c:if>
		
		<c:if test="${employee.id != null }">
			id:<from:input path="id"/> <br>
			<input type="hidden" name="_method" value="PUT">
		</c:if>
		
		Email:<from:input path="email" /> <br>
		<%
			Map<String, String> genders = new HashMap();
				genders.put("0", "female");
				genders.put("1", "male"); 
				request.setAttribute("genders", genders);
		%>
		Genders:<from:radiobuttons path="gender" items="${genders }" />  <br>
		Department:<from:select items="${demps }" path="department.id"  
			itemLabel="departmentName" itemValue="id">
		</from:select>  <br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>