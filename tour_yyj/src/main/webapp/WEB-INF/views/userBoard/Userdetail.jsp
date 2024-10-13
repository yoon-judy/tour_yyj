<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>게시물 상세</title>
</head>
<body>
<h2>${board.tour_name} 상세정보</h2>
<p>주소: ${board.tour_address}</p>
<p>설명: ${board.tour_cmmt}</p>
<p>전화번호: ${board.tour_telno}</p>
<p>수용 인원 수: ${board.custom_cnt}</p>
<p>주차 가능 수: ${board.car_cnt}</p>
<a href="${pageContext.request.contextPath}/user/board">목록으로 돌아가기</a>
</body>
</html>
