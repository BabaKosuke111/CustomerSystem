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
	<br>
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<div class="card" style="width: 25rem;">
					<div class="card-body">
						<h4 class="card-title">お問い合わせ回答</h4>
						<h5 class="card-title">登録しました</h5>
						<br>
						<div class="form-group">
							<label for="formGroupExampleInput">題名</label>
							<input type="text" class="form-control" id="formGroupExampleInput" placeholder="題名" readonly>
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">回答</label>
							<textarea class="form-control" id="exampleFormControlTextarea1" rows="5" readonly></textarea>
						</div>
						<br>
						<a class="btn btn-primary" href="UserList" role="button">ユーザリストへ</a>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</html>