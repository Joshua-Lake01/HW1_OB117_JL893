<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arcades List</title>
</head>
<body>
<h1>List of Arcades</h1>

<ul>
    <!-- Iterate over the list of arcades and display each arcade's name -->
    <c:forEach var="arcade" items="${arcades}">
        <li>${arcade.get_name()}</li>
    </c:forEach>
</ul>
</body>
</html>
