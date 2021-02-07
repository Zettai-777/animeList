<%--
  Created by IntelliJ IDEA.
  User: Zettai
  Date: 06.02.2021
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TITLES</title>
</head>
<body>
    <h2>Titles</h2>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>season</th>
            <th>year of publication</th>
            <th>overed</th>
            <th>genre</th>
            <th>watched</th>
            <th>action</th>
        </tr>
        <c:forEach var="title" items="${titleList}">
            <tr>
                <td>${title.id}</td>
                <td>${title.name}</td>
                <td>${title.season}</td>
                <td>${title.yearOfPublication}</td>
                <td>${title.overed}</td>
                <td>${title.genre}</td>
                <td>${title.watched}</td>
                <td>
                    <a href="/edit/${title.id}">edit</a>
                    <a href="/delete/${title.id}">delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h2>Add</h2>
    <c:url value="/add" var="add"/>
    <a href="${add}">Add new title</a>
</body>
</html>
