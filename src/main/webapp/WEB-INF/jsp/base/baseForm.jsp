<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />

<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="shortcut icon" href="${contextPath}/resources/images/home.png" type="image/x-icon">
        <link rel="stylesheet" href="${contextPath}/resources/css/jquery-ui.css">
        <link rel="stylesheet" href="${contextPath}/resources/css/common.css">

        <script type="text/javascript" src="${contextPath}/resources/js/common/common.js"></script>
        <script type="text/javascript" src="${contextPath}/resources/js/common/jquery-3.5.1.min.js"></script>
        <script type="text/javascript" src="${contextPath}/resources/js/common/jquery-ui.js"></script>
        <title>Home</title>
    </head>
    <body>
        <div id="header">
            <tiles:insertAttribute name="header"/>
        </div>
        <div id="contents">
            <tiles:insertAttribute name="contents"/>
        </div>
        <div id="footer">
            <tiles:insertAttribute name="footer"/>
        </div>
    </body>
</html>