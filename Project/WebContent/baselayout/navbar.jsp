<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<nav class="navbar navbar-light bg-light">
	<a class="nav-link" href="UserList">顧客情報管理システム</a>
	<div class="my-2 my-md-0 mr-md-3">
		<a class="btn btn-primary" href="UserSupportList" role="button">お問い合わせ一覧</a>
		<a class="btn btn-primary" href="UserSupport" role="button">お問い合わせフォーム</a>
		<a class="btn btn-primary" href="UserResist" role="button">顧客追加</a>
		<a class="btn btn-danger" href="Logout" role="button">ログアウト</a>
	</div>
</nav>