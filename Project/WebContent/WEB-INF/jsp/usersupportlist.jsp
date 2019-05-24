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
<title>ホーム</title>
</head>
<body>
	<jsp:include page="/baselayout/navbar.jsp" />
	<br>
	<br>
	<table class="container table text-center">
		<thead>
			<tr>
				<th scope="col">問い合わせ部品</th>
				<th scope="col">顧客名</th>
				<th scope="col"></th>
				<th scope="col"><a class="btn btn-primary" href="UserSupport" role="button">お問い合わせ追加</a></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="inquiry" items="${inquiryList}">
				<tr>
					<td>${inquiry.itemName}</td>
					<td>${inquiry.customerName}</td>
					<td><a class="btn btn-primary" href="UserSupportAnswer?inquiryId=${inquiry.inquiryId}" role="button">回答</a></td>
					<td><p class="text-primary">${inquiry.statusName}</p></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>