<%--
  Created by IntelliJ IDEA.
  User: ddzmi
  Date: 1/5/2019
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--JSTL TAGS FOR LOOPING--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Student Have Been Confiremd</h1>
<pre>${student.firstName} ${student.lastName}</pre>
<pre>${student.country}</pre>
<pre>${student.favoriteLanguage}</pre>

<ul>
    <c:forEach var="i" items="${student.OSsystems}">
        <li>${i}</li>
    </c:forEach>

</ul>

</body>
</html>
