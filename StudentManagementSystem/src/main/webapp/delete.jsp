<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="remove" modelAttribute="student">
<form:label path="id">ENTER ID TO REMOVE STUDENT:</form:label>
<form:input path="id"/>
<input type="submit" value="REMOVE">
</form:form>

</body>
</html>