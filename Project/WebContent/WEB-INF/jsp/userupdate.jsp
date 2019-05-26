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
<title>顧客情報更新画面</title>
</head>
<body>
	<jsp:include page="/baselayout/navbar.jsp" />
	<div class="container">
		<br> <br>
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<div class="card" style="width: 25rem;">
					<div class="card-body">
						<h5 class="card-title">顧客情報更新</h5>
						<form action="UserUpdate" method="post">
						<div class="form-group">
							<label for="InputCustomerName">顧客名</label>
							<input type="text" class="form-control" name ="customerName" value="${customer.customerName}">
						</div>
						<div class="form-group">
							<label for="inputCustomerNameKana">顧客名かな</label>
							<input type="text" class="form-control" name="customerNameKana" value="${customer.customerNameKana}">
						</div>
						<div class="form-group">
							<label for="inputPostalCode">郵便番号</label>
							<input type="text" class="form-control" name="postalCode" value="${customer.postalCode}">
						</div>
						<div class="form-group">
							<label for="inputAddress">住所</label>
							<input type="text" class="form-control" name="address" value="${customer.address }">
						</div>
						<input type="hidden" name="customerId" value="${customer.customerId}">
						<button type="submit" class="btn btn-primary">更新</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</body>
</html>