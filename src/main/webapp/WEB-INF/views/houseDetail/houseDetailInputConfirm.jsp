<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<h1>house_detail登録確認</h1>
<dl>

	<dt>TITLE</dt>
	<dd>
		<c:out value="${houseDetailForm.houseName}" />
	</dd>

	<dt>CONTENT</dt>
	<dd>
		<c:out value="${houseDetailForm.houseDetail}" />
	</dd>

	<dt>PRICE</dt>
	<dd>
		<c:out value="${houseDetailForm.housePrice}" />
	</dd>

	<dt>ADDRESS</dt>
	<dd>
		<c:out value="${houseDetailForm.houseAddress}" />
	</dd>

	<dt>CREATE_DATE</dt>
	<dd>
		<c:out value="${houseDetailForm.createDate}" />
	</dd>

	<dt>UPDATE_DATE</dt>
	<dd>
		<c:out value="${houseDetailForm.updateDate}" />
	</dd>

	<dt>ACCOUNT_INPUT_ID</dt>
	<dd>
		<c:out value="${houseDetailForm.accountId}" />
	</dd>

	<dt></dt>
	<dd>
		<c:out value="${houseDetailForm.categoryId}" />
	</dd>

</dl>

<form:form action="insert" method="post" onsubmit="return preventDouble();">
	<input type="submit" value="登録する" id="insert">
</form:form>
<form:form action="input" method="post">
	<input type="hidden" name="isBack" value="true">
	<input type="submit" value="戻る"/>
</form:form>