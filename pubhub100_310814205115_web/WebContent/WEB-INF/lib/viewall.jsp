<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ViewAll">
<table>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
</tr>
<c:forEach var="book" items="${books}">

<tr>
<td>${book.id}</td>
<td>${book.name}</td>
<td>${book.price}</td>
</tr>
</c:forEach>
</table>
</form>
<a href = "home.jsp"> Return Home</a>
</body>
</html>