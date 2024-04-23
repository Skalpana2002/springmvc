<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Employee Details</h2><br><br>
<table border="2">
<tr>
<th>STUDENT ID</th>
<th>STUDENT NAME</th>
<th>STUDENT AGE</th>
<th>STUDENT COURSE</th>

</tr>

<c:forEach items="${studentlist}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.age}</td>
<td>${student.course}</td>
</tr>

</c:forEach>

</table>
<button> <a href="index.jsp">BACK HOME</a> </button>

</body>
</html>