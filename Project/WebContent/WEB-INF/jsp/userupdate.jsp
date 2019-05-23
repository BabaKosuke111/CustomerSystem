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
<title>顧客情報編集</title>
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
							<label for="exampleInputEmail1">名前</label> <input type="text"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="馬場 幸介">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">名前かな</label> <input type="text"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="ばば こうすけ">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">郵便番号</label> <input type="text"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="185-0035">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">住所</label> <input type="text"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="東京都国分寺市">
						</div>
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