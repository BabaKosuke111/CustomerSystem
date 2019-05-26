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
<title>お問い合わせ登録画面</title>
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
						<h5 class="card-title">お問い合わせ</h5>
						<br>
						<form action="UserSupportConfirm" method="post">
							<div class="form-group">
								<label for="inputItemName">部品名</label>
								<select class="custom-select" name="itemId">
									<c:forEach var="item" items="${itemList}">
									<option value="${item.itemId}" >${item.itemName}</option>
									</c:forEach>
								</select>
								<label for="inputItemName">顧客名</label>
								<select class="custom-select" name="customerId">
									<c:forEach var="customer" items="${customerList}">
									<option value="${customer.customerId}">${customer.customerName}</option>
									</c:forEach>
								</select>
							</div>
							<br>
							<div class="form-group">
								<label for="exampleFormControlTextarea1">お問い合わせ内容</label>
								<textarea class="form-control" name="inquiryContents" rows="5" required></textarea>
							</div>
							<br>
							<button type="submit" class="btn btn-primary">登録する</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
</body>
</html>