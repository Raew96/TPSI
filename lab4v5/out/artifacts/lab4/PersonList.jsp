<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 31.03.2020
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <table border="4">
        <tr><th>Imie</th><th>Nazwisko</th><th>Email</th></tr>
    <c:forEach items="${lista}" var="obj">
            <tr>
                <td>${obj.getFirstName()}</td> <td>${obj.getLastName()}</td> <td>${obj.getEmailAddress()}</td>
            </tr>
    </c:forEach>
        </table>
</head>
<body>

</body>
</html>
