<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
        tr {
            transition: background-color 0.3s;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
<h2>게시판 목록</h2>
<a href="${pageContext.request.contextPath}/board/create" style="margin-bottom: 20px; display: inline-block; padding: 10px 15px; background-color: #007BFF; color: white; text-decoration: none; border-radius: 5px;">게시물 등록</a>
<table>
    <tr>
        <th>투어 이름</th>
        <th>투어 주소</th>
        <th></th>
    </tr>
    <c:forEach var="board" items="${boardList}">
        <tr>
            <td><a href="${pageContext.request.contextPath}/board/detail?tour_code=${board.tour_code}">${board.tour_name}</a></td>
            <td>${board.tour_address}</td>
            <td>
                <form action="${pageContext.request.contextPath}/board/delete" method="post" style="display:inline;">
                    <input type="hidden" name="tour_code" value="${board.tour_code}">
                    <input type="submit" value="삭제" onclick="return confirm('삭제하시겠습니까?');">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
