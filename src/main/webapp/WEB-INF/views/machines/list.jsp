<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arcades List</title>
</head>
<body>
<h1>List of Machines in ${arcade_name}</h1>

<ul>
    <c:forEach var="machine" items="${machines}">
        <li>
            <strong>Manufacturer:</strong> ${machine.manufacturer} <br/>
            <strong>Type:</strong> ${machine.type} <br/>
            <strong>Genre:</strong> ${machine.genre}<br/>
            <strong>Score:</strong> ${machine.score}<br/>
        </li>
        <br/>
    </c:forEach>
    <a href="/newMachine?arcade=${arcade_id}">Assign new machine</a>
</ul>
</body>
</html>
