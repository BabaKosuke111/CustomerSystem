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
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<div class="card" style="width: 30rem;">
					<div class="card-body">
					<form action="UserDelete" method="post">
						<h5 class="card-title">馬場幸介を削除してよろしいですか？</h5>
						<br>
						<button type="submit" class="btn btn-danger" name="confirm_button" value="">削除する</button>
						<button type="submit" class="btn btn-primary" name="confirm_button" value="">やめる</button>
					</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</html>