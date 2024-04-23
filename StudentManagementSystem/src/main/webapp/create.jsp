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
<h1>ENTER STUDENT DETAILS</h1><br><br>
<form:form action="save" modelAttribute="student">
<form:label path="id">ID:</form:label>
<form:input path="id"/><br><br>
<form:label path="name">NAME:</form:label>
<form:input path="name"/><br><br>
<form:label path="age">AGE:</form:label>
<form:input path="age"/><br><br>
<form:label path="course">Course</form:label>
<form:input path="course"/><br><br>

<input type="submit" value="Save Student">

</form:form>

</body>
</html>