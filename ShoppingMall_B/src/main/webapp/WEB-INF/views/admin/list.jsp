<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>
<style>
table{
border: 1px solid black;width: 60%;margin: 0 auto;
}
tr{
border: 1px solid black; text-align: center;
}
td{
margin: 10px;padding-top: 10px;
}
button{
margin: 0 auto;
font-size: 70%;
}
</style>


<div class="col-md-12">
	<div class="section-title">
		<h2 class="title">PRODUCT LIST(ADMIN)<button onclick="location.href='/product/register'">상품 등록</button></h2>
	</div>
</div>


<table>
<c:forEach var="product" items="${list }" >
	<tr>
		<td><a href="/admin/view?productCode=${product.productCode}"><h3>${product.productCode }</h3></a></td>
	</tr>
</c:forEach>
</table>
<br>
<%@include file="../includes/footer.jsp"%>