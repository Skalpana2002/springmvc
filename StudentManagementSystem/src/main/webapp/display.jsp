<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr> 
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>COURSE</th>

</tr>
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.age}</td>
<td>${student.course}</td>
</tr>
	
</table>
<button> <a href="index.jsp">BACK HOME</a> </button>


</body>
</html>