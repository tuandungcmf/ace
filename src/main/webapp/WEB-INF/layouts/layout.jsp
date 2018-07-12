<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="/WEB-INF/views/define.jsp" %>

<!DOCTYPE html>
<html lang="ja-JP">
<head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/site.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/fonts.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/css/unleash.custom.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resources/css/unleash.3.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/resources/css/responsive.css" rel="stylesheet" type="text/css" />

<meta charset="UTF-8">
<title>${title}</title>

</head>
<body>
<%@include file="/WEB-INF/views/common/header.jsp" %>
	<tiles:insertAttribute name="body" />
<%@include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>


