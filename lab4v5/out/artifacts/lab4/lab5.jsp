<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 06.04.2020
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<p><a href="/lab4/lab5">Wejdz_na_strone</a></p>

Licznik wyswietleń strony: ${sessionScope.counter}
<table border="4">
    <tr><th>Imie</th><th>Nazwisko</th><th>Email</th><th>Gropu ID</th></tr>
    <c:forEach items="${sessionScope.l}" var="obj">
        <tr>
            <td>${obj.firstName}</td> <td>${obj.lastName}</td> <td>${obj.emailAddress}</td><td>${obj.groupId}</td>
        </tr>
    </c:forEach>
</table>
<form action='/lab4/lab5' method='post'>
    Imie:
    <input type='text' name='firstName'>
    Nazwisko:
    <input type='text' name='lastName'>
    Email:
    <input type='text' name='emailAddress'>
    Group ID:
    <input type='text' name='groupId'>
    <input type='submit'>
</form>
</body>
</html>
