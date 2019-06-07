<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="includes/header.jsp"%>

<style>
#explain{
margin: 100px 0px 40px 40px;
font-size: 120%;
}
img{
width: 60%;
margin-left:20px;
}
</style>

<div class="section">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="section-title">
					<h2 class="title">GUIDE</h2>
				</div>
			</div>
			
			
			<div id="explain">
				<h3>인터넷 가이드</h3><br>
				저희 쇼핑몰의 사용법을 알려드리는 편리한 인터넷 가이드를 체험해 보세요.
			</div>
			
			<img alt="guide" src="../../resources/img/guide.jpg">
		</div>
	</div>
</div>

<%@include file="includes/footer.jsp"%>