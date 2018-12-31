<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>productItems</title>
</head>
<body>
	<table width="100%" border="2">
		<tr>
			<th>product_name</th>
			<th>product_price</th>
			<th>product_detail</th>
		</tr>
		<c:forEach items="${list }" var="list">
			<tr>
				<td>${list.name }</td>
				<td>${list.price }</td>
				<td>${list.detail }</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="/springmvc2/order/queryproduct.action">
		<input type="text" name="someText"><br>
		<input type="submit" value="查找">
	</form>
</body>
</html>