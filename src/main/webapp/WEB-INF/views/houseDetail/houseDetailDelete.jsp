<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<h1>house_detail削除</h1>
<dl>

	<dt>house_detailID</dt>
	<dd>
		<c:out value="${houseDetail.id}" />
	</dd>

	<dt>TITLE</dt>
	<dd>
		<c:out value="${houseDetail.houseName}" />
	</dd>

	<dt>CONTENT</dt>
	<dd>
		<c:out value="${houseDetail.houseDetail}" />
	</dd>

	<dt>PRICE</dt>
	<dd>
		<c:out value="${houseDetail.housePrice}" />
	</dd>

	<dt>ADDRESS</dt>
	<dd>
		<c:out value="${houseDetail.houseAddress}" />
	</dd>

	<dt>CREATE_DATE</dt>
	<dd>
		<c:out value="${houseDetail.createDate}" />
	</dd>

	<dt>UPDATE_DATE</dt>
	<dd>
		<c:out value="${houseDetail.updateDate}" />
	</dd>

	<dt>ACCOUNT_INPUT_ID</dt>
	<dd>
		<c:out value="${houseDetail.accountId}" />
	</dd>

	<dt></dt>
	<dd>
		<c:out value="${houseDetail.categoryId}" />
	</dd>

</dl>
<br>
<form:form action="delete" method="post">
	<input type="hidden" name="houseDetailId" value="<c:out value='${houseDetail.id}' />" />
	<input type="submit" value="削除" />
</form:form>

<form action="list">
	<input type="submit" value="戻る"/>
</form>
