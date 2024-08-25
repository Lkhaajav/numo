<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>

<link rel="stylesheet" href="${contextPath}/resources/css/base/footer.css?v=<%=System.currentTimeMillis()%>">
<script type="text/javascript" src="${contextPath}/resources/js/base/footer.js?v=<%=System.currentTimeMillis()%>"></script>

<footer>
	<div class="footer">
		Copyright © 2024 Apple Inc. All rights reserved.
	</div>
</footer>