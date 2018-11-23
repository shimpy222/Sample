<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
/* unvisited link */
a:link {
    color: red;
}

/* visited link */
a:visited {
    color: green;
}

/* mouse over link */
a:hover {
    color: hotpink;
}

/* selected link */
a:active {
    color: blue;
}
</style>
</head>
<body>
<a href="pdf">Generate Pdf Result</a>
<div class="container">
<div class="jumbotron">
<h1>Result Page!..</h1></div></div>
<div class="alert alert-info">
<H2>The Total Questions are:</H2>${model.end} 
</div>
<br>
<br>
<div class="alert alert-info">
<H2>The result is:</H2>${model.counter} 
</div>

</body>
</html>