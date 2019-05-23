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
						<form action="UserResistConfirm">
							<div class="form-group">
								<label for="inputName4">顧客名</label>
								<input type="text" class="form-control" name="customerName" placeholder="顧客名">
							</div>
							<div class="form-group">
								<label for="inputNamekana4">顧客名かな</label>
								<input type="text" class="form-control" name="customerNamekana" placeholder="顧客名かな">
							</div>
							<div class="form-group">
								<label for="inputPostalCode">郵便番号</label>
								<input type="text" class="form-control" name="postalCode" placeholder="郵便番号">
							</div>
							<div class="form-group">
								<label for="inputAddress">住所</label>
								<input type="text" class="form-control" name="address" placeholder="住所">
							</div>
							<button type="submit" class="btn btn-primary">登録</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</html>