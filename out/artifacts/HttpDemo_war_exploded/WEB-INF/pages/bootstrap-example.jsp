<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.11.2017
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6"></div>
        <div class="col-lg-6"></div>
    </div>
    <div class="row">
        <div class="col-lg-4">
        <form method="post" action="${pageContext.request.contextPath}/login">
            <div class="form-group">
                <label for="FirstName"> First name: </label>
                <input type="text" name="firstName" class="form-control" id="FirstName" >
            </div>
            <div class="form-group">
                <label for="Surname"> Surname: </label>
                <input type="text" name="surname" class="form-control" id="Surname">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-md">Submit</button>
            </div>
        </form>
        </div>
        <div class="col-lg-4"></div>
        <div class="col-lg-4"></div>
    </div>
    <div class="row">
        <div class="col-lg-12"></div>
    </div>
</div>

</body>
</html>
