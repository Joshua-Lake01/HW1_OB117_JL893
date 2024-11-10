<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arcades List</title>
</head>
<body>
<h1>List of Arcades</h1>

<ul>
    <c:forEach var="arcade" items="${arcades}">
        <li>${arcade.name}</li>
    </c:forEach>

<%--    <li> ${first_arcade.name} </li>--%>
</ul>
</body>
</html>
