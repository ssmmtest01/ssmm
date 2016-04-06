<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	function show(id){
		$(".dfinput").val('');
		$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;");
		$('#detail_'+id).show('slow');
		
	}
	
	function add(){
		$(".dfinput").val('');
		$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;");
		$('#add').show('slow');
		
	}
</script>
</head>
<body>
	<table class="tablelist">
		<thead>
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.name }</td>
					<td><a href="/clp/userController/delete.do?id=${user.id }">删除</a>
						<a href="javascript:void(0);" onclick="show(${user.id})">修改</a>
						</td>
				</tr>
				<div id="detail_${user.id }" class="tail">
					<div class="tailinfo1">
						<br> &nbsp; &nbsp; &nbsp; &nbsp; 请输入姓名： <br /> &nbsp; &nbsp;
						&nbsp; &nbsp;
						
						<input type="text" value="${user.name }" id="t${user.id}"/>
						&nbsp; &nbsp; &nbsp; &nbsp;
						<div class="tailbtn">
							<input name="" type="button" value="确定"
								onclick="javascript:sure('${user.id}');" />&nbsp; <input
								name="" type="button" class="cancel" value="取消"
								onclick="$('.tail').fadeOut(100);" />
						</div>
					</div>
			</c:forEach>
		</tbody>
	</table>
	
	
	<button onclick="add()">添加</button>
	<div id="add" class="tail">
					<div class="tailinfo1">
						<br> &nbsp; &nbsp; &nbsp; &nbsp; 请输入姓名： <br /> &nbsp; &nbsp;
						&nbsp; &nbsp;
						
						<input type="text" value="${user.name }" id="n"/>
						&nbsp; &nbsp; &nbsp; &nbsp;
						<div class="tailbtn">
							<input name="" type="button" value="确定"
								onclick="javascript:sure1();" />&nbsp; <input
								name="" type="button" class="cancel" value="取消"
								onclick="$('.tail').fadeOut(100);" />
						</div>
					</div>
<script type="text/javascript">
function sure1(){
    alert($("#n").val().trim());
	$('.tail').fadeOut(100);
	$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;");
		$.post('/clp/userController/add.do',{'name':$("#n").val().trim()}, 
		function(data){
        window.location.href = "${pageContext.request.contextPath}/userController/getall";}
     );
	
}
	function sure(id){
	$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;");
	    deleteCompanyaccount(id);
	}						
	function  deleteCompanyaccount(id){
	$(".tips_").html("");
	if($("#t"+id).val()==null||$("#t"+id).val()=='' ){
		$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;&nbsp;请输入姓名");
		
	}
	else {
		$('.tail').fadeOut(100);
		$(".tips_").html("&nbsp;   &nbsp; &nbsp; &nbsp;");
				 $.post('/clp/userController/update.do',{'Id':id,'name':$("#t"+id).val().trim()}, 
			function(data){
	        window.location.href = "${pageContext.request.contextPath}/userController/getall";
	     });
		
	}
	}
	
	</script>
</body>
</html>