<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<style>
table, td, th {
    border: 1px solid black;
}
#table2 {
    border-collapse: collapse;
}
</style>
</head>

<body>


<form:form action="ResultPage?start=${listEmployee.get(0).getQid()}&end=${listEmployee.get(listEmployee.size()-1).getQid()}" method="post" modelAttribute="employee">
<div class="container">
<div class="jumbotron">
  
<table id="table2">
  
  
       
  <core:forEach var="questionPaper" items="${listEmployee}" ><br/><br/>
  	<core:set var = "end" scope = "application" value = "${questionPaper.qid}"/>
       <pre>
       <input type="hidden" value="${questionPaper.qid}" name="quesNum"/>
       <core:out value="${questionPaper.qid}"></core:out> <core:out value="${questionPaper.qname}"></core:out>
        </pre>
   
        &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio"  onclick="abc()" id="option1" name="option${questionPaper.qid}" value="${questionPaper.option1}">
        <core:out  value="${questionPaper.option1}"></core:out><br/>
    
        &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" onclick="abc()" id="option2" name="option${questionPaper.qid}" value="${questionPaper.option2}">
        <core:out value="${questionPaper.option2}"></core:out><br/>
     
        &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" onclick="abc()"  id="option3" name="option${questionPaper.qid}" value="${questionPaper.option3}">
        <core:out value="${questionPaper.option3}"></core:out><br/>
      
        &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" onclick="abc()" id="option4" name="option${questionPaper.qid}" value="${questionPaper.option4}">
        <core:out value="${questionPaper.option4}"></core:out><br/>
     
     
     
        </core:forEach>
        </table>
        <input type="submit" value="next" class="btn btn-success">
       
  
 </div>
</div> 

</form:form>


 
</body>

</html>