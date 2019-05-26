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
<title>お問い合わせ一覧画面</title>
</head>
<body>
	<jsp:include page="/baselayout/navbar.jsp" />
	<br>
	<br>
	<div class="container">
		<form action="UserSupportList" method="post">
			<div class="card ">
				<div class="form-group">
					<div class="card-header">問い合わせ検索</div>
					<div class="card-body">
						<h5 class="card-title">問い合わせ部品名</h5>
						<input type="text" class="form-control" placeholder="問い合わせ部品名" name="itemName" style="width: 500px;"> <br> <br>
						<h5 class="card-title">顧客名</h5>
						<input type="text" class="form-control" placeholder="顧客名" name="customerName" style="width: 500px;"> <br> <br>
						<button type="submit" class="btn btn-primary">検索</button>
					</div>
				</div>
			</div>
		<hr>
		</form>
		</div>
	<table class="container table text-center">
		<thead>
			<tr>
				<th scope="col">問い合わせ部品名</th>
				<th scope="col">顧客名</th>
				<th scope="col"></th>
				<th scope="col"><a class="btn btn-primary" href="UserSupport" role="button">お問い合わせ追加</a></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="inquiry" items="${inquiryList}">
				<tr>
					<td>${inquiry.itemName}</td>
					<td>${inquiry.customerName}</td>
					<td><a class="btn btn-primary" href="UserSupportAnswer?inquiryId=${inquiry.inquiryId}" role="button">確認・回答</a></td>
					<td>
					<c:choose>
					<c:when test="${inquiry.statusName=='対応完了'}">
						<p class="text-primary">${inquiry.statusName}</p>
					</c:when>
					<c:otherwise>
						<p class="text-danger">${inquiry.statusName}</p>
					</c:otherwise>
					</c:choose>
					</td>
					<td><a class="btn btn-danger" href="UserSupportDelete?inquiryId=${inquiry.inquiryId}" role="button">削除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>
</body>
</html>