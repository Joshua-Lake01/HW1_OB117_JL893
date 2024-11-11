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
        <li>
            <strong>Name:</strong> ${arcade.name} <br/>
            <strong>Email:</strong> ${arcade.email} <br/>
            <a href="/machines?arcade=${arcade.id}">View Machines</a>
        </li>
        <br/>
    </c:forEach>
    <a href="/newArcade">Create New Arcade</a>
</ul>
</body>
</html>
