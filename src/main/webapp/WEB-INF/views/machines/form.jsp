<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Arcade</title>
</head>
<body>

<h1>Create a New Arcade</h1>

<form:form modelAttribute="machine" action="/addMachine" method="post">

    <div>
        <label for="manufacturer">Manufacturer ID:</label>
        <form:input path="manufacturer" id="manufacturer"/>
    </div>
    <br/>

    <div>
        <label for="type">Type:</label>
        <form:input path="type" id="type" />
    </div>
    <br/>

    <div>
        <label for="genre">Genre:</label>
        <form:input path="genre" id="genre" />
    </div>
    <div>
        <label for="score">Score:</label>
        <form:input path="score" id="score" />
    </div>
    <br/>

    <div>
        <a href="/addArcade?arcade=${arcade_id}"><button type="submit">Add Arcade</button></a>
    </div>

</form:form>

</body>
</html>
