<html>
<body>
<h2>Hello World!</h2>
<a href="hello">hello SpringMVC</a>
<br/>
<h2>test springmvc method</h2>
<form action="testmethod" method="post">
	<input type="submit" value="submit">
</form>
<h2>test springmvc paramsandheaders</h2>
<a href="testParamsAndHeaders?username=hetaoo">test paramsandheaders</a>
<h2>test springMVC AUT</h2>
<a href="testAut/aa/abc">testAUT</a>
<h2>test springmvc testPathVariable</h2>
<a href="testPathVariable/12">testPathVariable</a>


<br>
<h2>test rest get</h2>
<a href="testget/1">test rest get</a>

<br>
<h2>test rest post</h2>
<form action="testpost" method="post">
	<input type="submit" value="submit">
</form>

<br>
<h2>test rest delete</h2>
<form action="testdelete/1" method="post">
	<input type="hidden" name="_method" value="delete">
	<input type="submit" value="submit">
</form>

<br>
<h2>test rest put</h2>
<form action="testput/1" method="post">
	<input type="hidden" name="_method" value="put">
	<input type="submit" value="submit">
</form>

<br>

<h2>test requestparams</h2>
<a href="testrequestparams?username=hetaoo&age=12">test requestparams</a>

<h2>test RequestHeader</h2>
<a href="testRequestHeader">test RequestHeader</a>

<h2>test CookieValue</h2>
<a href="testCookieValue">test CookieValue</a>
<h2>test Pojo</h2>
<form action="testPojo" method="post">
	username:<input type="text" name="username">
	password:<input type="password" name="password">
	age:<input type="text" name="age">
	city:<input type="text" name="address.city">
	province:<input type="text" name="address.province">
	<input type="submit" value="submit">
</form>

<h2>testModelAndView</h2>
<a href="testModelAndView">test ModelAndView</a>
<h2>test MapAndModel</h2>
<a href="testMapAndModel">test MapAndModel</a>
<h2>test SessionAttributes</h2>
<a href="testSessionAttributes">test SessionAttributes</a>
<h2>test ModelAttribute</h2>
<form action="testModelAttribute" method="post">	
	<input type="hidden" name="id" value="1">
	<input type="text" name="username" value="hetaoo">
	<input type="text" name="age" value="18">
	<input type="submit" value="submit">
</form>
</html>
