<%--
  Created by IntelliJ IDEA.
  User: ddzmi
  Date: 1/5/2019
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Amazing Student Form</title>
</head>
<body>
<h1> This is a student Form that uses POJO </h1>

<%--Student Attribute comes from controller--%>
<form:form action="processForm" modelAttribute="student">
    <table>
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Country</td>

            <form:select path="country">
                <form:options items="${theCountryOptions}"/>
            </form:select>

        </tr>

        <tr>
            <td>Choose a Language :</td>
            <td><form:radiobuttons path="favoriteLanguage" items="${languageOptions}"/>
            </td>

        </tr>

        <tr>
            <td>Chose Os System</td>
            <td> <form:checkboxes path="OSsystems" items="${OSOptions}"></form:checkboxes></td>
        </tr>
        <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
        </tr>
    </table>
</form:form>


</body>
</html>
