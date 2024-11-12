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

<form:form modelAttribute="arcade" action="/addArcade" method="post">

    <div>
        <label for="id">Estimated ID:</label>
        <form:input path="id" id="id" value="${estimated_id}" readonly="false" placeholder="${estimated_id}"/>
        <form:errors path="id"/>
    </div>
    <br/>

    <div>
        <label for="name">Name:</label>
        <form:input path="name" id="name" />
        <form:errors path="name"/>
    </div>
    <br/>

    <div>
        <label for="email">Email:</label>
        <form:input path="email" id="email" />
        <form:errors path="email"/>
    </div>
    <br/>

    <div>
        <button type="submit">Add Arcade</button>
    </div>

</form:form>

</body>
</html>
