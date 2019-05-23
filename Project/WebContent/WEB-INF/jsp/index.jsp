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
<title>お問い合わせ管理システム</title>
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<span class="navbar-brand mb-0 h1">お問い合わせ管理システム</span>
	</nav>
	<div class="container">
		<br> <br>
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<div class="card" style="width: 25rem;">
					<div class="card-body">
						<h5 class="card-title text-center">ログイン</h5>
						<form action="Index" method="post">
						<c:if test="${loginerrMsg!=null}">
							<div class="alert alert-danger" role="alert">${loginerrMsg}</div>
						</c:if>
						<div class="form-group">
							<label for="inputEmail4">ユーザID</label>
							<input type="text" class="form-control" name="userId" placeholder="ユーザID" required>
						</div>
						<div class="form-group">
							<label for="inputPassword4">パスワード</label>
							<input type="password" class="form-control" name="password" placeholder="パスワード" required>
						</div>
						<button type="submit" class="btn btn-primary">ログイン</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</html>