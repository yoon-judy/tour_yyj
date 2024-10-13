<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>게시판 목록</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h2>게시판 목록</h2>
<table>
    <tr>
        <th>투어 이름</th>
        <th>투어 주소</th>
    </tr>
    <c:forEach var="board" items="${boardList}">
        <tr>
            <td><a href="${pageContext.request.contextPath}/user/board/detail?tour_code=${board.tour_code}">${board.tour_name}</a></td>
            <td>${board.tour_address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
