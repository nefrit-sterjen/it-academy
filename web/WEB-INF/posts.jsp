<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.11.2017
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guest book</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

</head>
<body>
<table border="1">
    <c:forEach items="${posts}" var="post">
        <tr>
            <td>${post.id}</td>
            <td>${post.text}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
