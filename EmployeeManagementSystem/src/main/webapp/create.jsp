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

<h1>Enter Employee Details</h1><br><br>
<form:form action="save" modelAttribute="employee">
 <form:label path="id">ID </form:label>
 <form:input path="id"/>
 
 
 <form:label path="name">Name:</form:label>
 <form:input path="name"/>
 
 <form:label path="Designation">Designation:</form:label>
 <form:input path="Designation"/>
 
 <form:label path="salary">Salary:</form:label>
 <form:input path="salary"/>
 
 <input type="submit" value="save employee">
 
 
 
 
 
 
</form:form>



</body>
</html>