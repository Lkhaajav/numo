<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>

<%@ page import="java.util.Map" %>
<%@ page import="static numo.common.constants.SessionAttrs.USERINFO_WITHOUT_PRIVACY" %>
<%@ page import="static numo.common.constants.SessionAttrs.LOGGED_DATETIME" %>
<%@ page import="static numo.common.constants.SessionAttrs.*" %>

<link rel="stylesheet" href="${contextPath}/resources/css/base/header.css?v=<%=System.currentTimeMillis()%>">
<script type="text/javascript" src="${contextPath}/resources/js/base/header.js?v=<%=System.currentTimeMillis()%>"></script>

<header>
	<div class="header">
		<div class="menu">
		    <a href="#" url="home"><span>Home</span></a>
		    <a href="#" url="other"><span>Other</span></a>
		    <a href="#" url="help"><span>Help</span></a>
		</div>
	</div>
</header>