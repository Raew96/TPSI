<%--
  Created by IntelliJ IDEA.
  User: Rafal
  Date: 30.03.2020
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action='/lab4/hello' method='post'>
      Imie:
      <input type='text' name='firstName'>
      Nazwisko:
      <input type='text' name='lastName'>
      Email:
      <input type='text' name='emailAddress'>
      <input type='submit'>


    </form>

    <p><a href="/lab4/personList">PersonListServlet</a></p>
    <p><a href="/lab4/lab5">Lab5</a></p>
  </body>
</html>
