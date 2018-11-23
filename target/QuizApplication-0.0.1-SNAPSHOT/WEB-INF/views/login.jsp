<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Login Page</title>
</head>
<body>
<div class="container">
<div class="jumbotron">
    	<div align="center">
        <h1>Login Credentials!.</h1>
        <br>
        <br>
        <form:form action="loginEmployee" method="post" modelAttribute="login">
        <table cellspacing="10">
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /><form:errors path="name"></form:errors></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="pass" /><form:errors path="pass"></form:errors></td>
            </tr>
            </table>
            <br>
            <table align="right">
             <tr>
                <td colspan="2" align="center"><input type="submit" class="btn btn-success" value="Save"></td>
            </tr>
        </table>
        </form:form>
        </div>
    </div>
    </div>
</body>
</html>