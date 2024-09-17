<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="getdata"  method="post" modelAttribute="std">
<label>rno</label>
<form:input path="rno"/>

<br>
<label>sname</label>
<form:input path="sname"/>


<form:input type="submit" value="submit"/>


</form:form>


</body>
</html>