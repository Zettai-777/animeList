<%--
  Created by IntelliJ IDEA.
  User: Zettai
  Date: 06.02.2021
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <c:if test="${empty title.name}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty title.name}">
        <title>Edit</title>
    </c:if>
</head>

<body>
<c:if test="${empty title.name}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty title.name}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="post">
    <c:if test="${!empty title.name}">
        <input type="hidden" name="id" value="${title.id}">
    </c:if>
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="season">Season</label>
    <input type="text" name="season" id="season">
    <label for="yearOfPublication">Year of publication</label>
    <input type="text" name="yearOfPublication" id="yearOfPublication">
    <label for="overed">Overed</label>
    <input type="text" name="overed" id="overed">
    <label for="genre">Genre</label>
    <input type="text" name="genre" id="genre">
    <label for="watched">Watched</label>
    <input type="text" name="watched" id="watched">
    <c:if test="${empty title.name}">
        <input type="submit" value="Add new title">
    </c:if>
    <c:if test="${!empty title.name}">
        <input type="submit" value="Edit title">
    </c:if>

</form>
</body>
</html>
