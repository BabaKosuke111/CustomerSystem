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
						<h5 class="card-title">登録しました</h5>
							<div class="form-group">
								<label for="inputName4">顧客名</label>
								<input type="text" class="form-control"  placeholder="${customer.customerName}" readonly>
							</div>
							<div class="form-group">
								<label for="inputNamekana4">顧客名かな</label>
								<input type="text" class="form-control"  placeholder="${customer.customerNameKana}" readonly>
							</div>
							<div class="form-group">
								<label for="inputPostalCode">郵便番号</label>
								<input type="text" class="form-control" placeholder="${customer.postalCode}" readonly>
							</div>
							<div class="form-group">
								<label for="inputAddress">住所</label>
								<input type="text" class="form-control" placeholder="${customer.address}" readonly>
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