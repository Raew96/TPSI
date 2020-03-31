<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 30.03.2020
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Java Web - laboratorium 4</title>
</head>
<body>
<h1>Cześć, <c:out value="${imie}"/>!</h1>
<h1>Witaj!, ${obj.getFirstName()} ${obj.getLastName()} <a href=" mailto=${obj.getEmailAddress()}"/>${obj.getEmailAddress()}</h1>


<p><a href="/lab4/personList">PersonListServlet</a></p>
<!--Zad 2
Działa tak samo
-->

</body>
</html>

