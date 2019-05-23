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
				<th scope="col">顧客名</th>
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>馬場 幸介</td>
				<td><a class="btn btn-primary" href="UserUpdate" role="button">編集</a></td>
				<td><a class="btn btn-primary" href="UserDelete" role="button">削除</a></td>
			</tr>
			<tr>
				<td>美野輪 剛大</td>
				<td><a class="btn btn-primary" href="#" role="button">編集</a></td>
				<td><a class="btn btn-primary" href="#" role="button">削除</a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>