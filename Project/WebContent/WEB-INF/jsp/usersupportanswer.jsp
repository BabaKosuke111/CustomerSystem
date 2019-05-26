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
<title>お問い合わせ回答画面</title>
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
						<h5 class="card-title">お問い合わせ回答</h5>
						<br>
						<form action="UserSupportAnswerConfirm" method="post">
						<div class="form-group">
							<label for="formGroupExampleInput">部品名</label>
							<input type="text" class="form-control" placeholder="${inquiry.itemName}" readonly>
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput">顧客名</label>
							<input type="text" class="form-control" placeholder="${inquiry.customerName}" readonly>
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">お問い合わせ</label>
							<textarea class="form-control" placeholder="${inquiry.inquiryContents}" rows="5" readonly></textarea>
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">回答</label>
							<textarea class="form-control" name="replyContents" rows="5" required></textarea>
						</div>
						<br>
						<input type="hidden" name="inquiryId" value="${inquiry.inquiryId}">
						<button type="submit" class="btn btn-primary">回答する</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col"></div>
		</div>
	</div>
	<br>
	<br>
</body>
</html>