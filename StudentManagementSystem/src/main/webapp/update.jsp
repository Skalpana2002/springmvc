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
<form:form action="modify" modelAttribute="student">
 <form:label path="id">ID </form:label>
 <form:input path="id"/>
 
 
 <form:label path="name">Name:</form:label>
 <form:input path="name"/>
 
 <form:label path="age">Age:</form:label>
 <form:input path="age"/>
 
 <form:label path="course">Course:</form:label>
 <form:input path="course"/>
 
 <input type="submit" value="UPDATE STUDENT">
 
 </form:form>
 
 
</body>
</html>