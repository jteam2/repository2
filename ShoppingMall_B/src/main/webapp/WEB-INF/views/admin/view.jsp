<%@page import="come.team.domain.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>
<style>
table {
	border: 1px solid black;
	width: 80%;
	margin: 0 auto;
	text-align: center;
	height: 500px;
}

tr {
	padding: 20px;
}

td {
	border: 1px solid black;
}

a {
	text-decoration: underline;
	color: blue;
}

#btns {
	display: block;
	width: 290px;
	margin: 0 auto;
	margin-top: 15px;
}
</style>
<div class="col-md-12">
	<div class="section-title">
		<h2 class="title">PRODUCT VIEW(ADMIN)</h2>
	</div>
</div>
<table>
	<tr>
		<td><h3>상품정보</h3></td>
		<td><h3>${product.productCode }</h3></td>
	</tr>
	<tr>
		<td><h3>상품이름</h3></td>
		<td><h3>${product.productName }</h3></td>
	</tr>
	<tr>
		<td><h3>제조사</h3></td>
		<td><h3>${product.manufacturer }</h3></td>
	<tr>
		<td><h3>가격</h3></td>
		<td><h3>${product.price }</h3></td>
	</tr>
	<tr>
		<td><h3>설명</h3></td>
		<td><h3>${product.description }</h3></td>
	</tr>
	<tr>
		<td><h3>운영체제</h3></td>
		<td><h3>${product.os }</h3></td>
	</tr>
	<tr>
		<td><h3>상품종류</h3></td>
		<td><h3>${product.productType }</h3></td>
	</tr>
	<tr>
		<td><h3>재고</h3></td>
		<td><h3>${product.stock }</h3></td>
	</tr>
	<tr>
		<td><h3>사용용도</h3></td>
		<td><h3>${product.usability }</h3></td>
	</tr>
</table>
<div id="btns">
	<button
		onclick="location.href='/admin/update?productCode=${product.productCode}'">
		<h3>update</h3>
	</button>
	<button
		onclick="location.href='/admin/delete?productCode=${product.productCode}'">
		<h3>delete</h3>
	</button>
</div>
<br>
<%@include file="../includes/footer.jsp"%>