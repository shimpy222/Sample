<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Question</title>
</head>
<body>
<div class="container">
<div class="jumbotron">
    <div align="center">
        <h1>Add new Questions</h1>
        <form:form action="saveQuestion" method="post" modelAttribute="question">
        <table>
            <form:hidden path="qid"/>
            <tr>
                <td>Question:</td>
                <td><form:input path="qname" /><form:errors path="qname"></form:errors></td>
            </tr>
            <tr>
                <td>Option1:</td>
                <td><form:input path="option1" /><form:errors path="option1"></form:errors></td>
            </tr>
            <tr>
                <td>Option2:</td>
                <td><form:input path="option2" /><form:errors path="option2"></form:errors></td>
            </tr>
            <tr>
                <td>Option3:</td>
                <td><form:input path="option3" /><form:errors path="option3"></form:errors></td>
            </tr>
            <tr>
                <td>Option4:</td>
                <td><form:input path="option4" /><form:errors path="option4"></form:errors></td>
            </tr>
            <tr>
            <td>Result:</td>
                <td><form:input path="result" /><form:errors path="result"></form:errors></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
    </div>
    </div>
</body>
</html>