<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>게시물 삭제</title>
</head>
<body>
<h2>게시물 삭제</h2>

<p>삭제하시겠습니까?</p>
<form action="${pageContext.request.contextPath}/board/delete" method="post">
    <input type="hidden" name="tour_code" value="${board.tour_code}">
    <p>투어 이름: ${board.tour_name}</p>
    <p>투어 주소: ${board.tour_address}</p>
    <input type="submit" value="삭제">
</form>
<a href="${pageContext.request.contextPath}/board/list">목록</a>
</body>
</html>
