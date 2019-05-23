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
	<table class="container table ">
		<thead>
			<tr>
				<th scope="col">お問い合わせ</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>シャドバが糞ゲーについて</td>
				<td><a class="btn btn-primary" href="UserSupportAnswer" role="button">回答</a></td>
				<td><p class="text-primary">回答待ち</p></td>
			</tr>
			<tr>
				<td>いつになったら３階の水道は直るのですか？</td>
				<td><a class="btn btn-primary" href="" role="button">回答</a></td>
				<td><p class="text-danger">回答済み</p></td>
			</tr>
		</tbody>
	</table>
</body>
</html>