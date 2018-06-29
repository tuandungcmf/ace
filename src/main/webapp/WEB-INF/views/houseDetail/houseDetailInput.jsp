<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<h1>house_detail登録</h1>
<form:form modelAttribute="houseDetailForm" action="inputConfirm" method="post">
	<dl>
	
		<dt>TITLE</dt>
		<dd>
			<form:input path="houseName" /><br>
			<form:errors path="houseName" class="error-message" />
		</dd>
	
		<dt>CONTENT</dt>
		<dd>
			<form:input path="houseDetail" /><br>
			<form:errors path="houseDetail" class="error-message" />
		</dd>
	
		<dt>PRICE</dt>
		<dd>
			<form:input path="housePrice" /><br>
			<form:errors path="housePrice" class="error-message" />
		</dd>
	
		<dt>ADDRESS</dt>
		<dd>
			<form:input path="houseAddress" /><br>
			<form:errors path="houseAddress" class="error-message" />
		</dd>
	
		<dt>CREATE_DATE</dt>
		<dd>
			<form:input path="createDate" /><br>
			<form:errors path="createDate" class="error-message" />
		</dd>
	
		<dt>UPDATE_DATE</dt>
		<dd>
			<form:input path="updateDate" /><br>
			<form:errors path="updateDate" class="error-message" />
		</dd>
	
		<dt>ACCOUNT_INPUT_ID</dt>
		<dd>
			<form:input path="accountId" /><br>
			<form:errors path="accountId" class="error-message" />
		</dd>
	
		<dt></dt>
		<dd>
			<form:input path="categoryId" /><br>
			<form:errors path="categoryId" class="error-message" />
		</dd>
	
	</dl>
	<input type="submit" value="確認する">
</form:form>
<form action="list">
	<input type="submit" value="戻る">
</form>