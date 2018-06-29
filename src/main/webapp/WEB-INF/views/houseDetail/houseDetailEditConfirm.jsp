<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<h1>house_detail更新確認</h1>

<dl>

	<dt>house_detailID</dt>
	<dd>
		<c:out value="${houseDetailId}" />
	</dd>

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
<form:form action="update" method="post">
	<input type="hidden" name="houseDetailId" value="<c:out value='${houseDetailId}' />" />
	<input type="submit" value="変更"/>
</form:form>
<form:form action="edit">
	<input type="hidden" name="houseDetailId" value="<c:out value='${houseDetailId}' />" />
	<input type="hidden" name="isBack" value="true">
	<input type="submit" value="戻る"/>
</form:form>
