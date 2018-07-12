<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/define.jsp" %>
<% pageContext.setAttribute("newLineChar", "\n"); %>
<div class="container">
	<h1>Danh sách nhà hiện có:</h1>
	
	<div class="row">
	<c:forEach items="${houseDetails}" var="house">
	<div class="col-md-4">
		<div class="panel panel-primary">
		<span>Tên nhà: <b><c:out value="${house.houseName}"/></b><span><br>
		<span>Giá: <b><c:out value="${house.housePrice}"/></b></span><br>
		<form:form action="detail">
			<input type="hidden" name="houseDetailId" value="<c:out value="${house.id}"/>"/>
			<input class="btn btn-info" type="submit" value="Xem thêm"/> 
		</form:form>
		</div>
	</div>
	</c:forEach>
	</div>
</div>
<%@include file="/WEB-INF/views/common/footer.jsp" %>