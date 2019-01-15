<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color: #fc6dff
        }
    </style>
</head>
<body>


<div class="jumbotron">
    <div class="container">
        <h1>Form </h1>
        <p>Super Form </p>
    </div>
</div>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName" />
    <form:errors path="firstName" cssClass="error" />
    <br><br>

    Last name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" />
    <br><br>

    Free Passes : <form:input path="freePasses" />
    <form:errors path="freePasses" cssClass="error" />
    <br><br>
    Zip Code : <form:input path="zipCode" />
    <form:errors path="zipCode" cssClass="error" />
    <br><br>

    <input type="submit" value="Submit" />
</form:form>

</body>

</html>










