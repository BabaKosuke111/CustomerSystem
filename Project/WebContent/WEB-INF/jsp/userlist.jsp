<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>ユーザ一覧</title>
</head>
<body>
	<jsp:include page="/baselayout/navbar.jsp" />
	<br>
	<br>
	<table class="container table ">
		<thead>
			<tr>
				<th scope="col">顧客名</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td>${customer.customerName}</td>
					<td><a class="btn btn-primary" href="UserUpdate?customerId=${customer.customerId}" role="button">編集</a></td>
					<td><a class="btn btn-danger" href="UserDelete?customerId=${customer.customerId}" role="button">削除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>