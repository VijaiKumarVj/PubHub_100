<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify by prize</title>
</head>
<body>
<form action="EditServlet" method = "post">
Book_Name<input type = "text" name = "name"><br>
New_Price<input type = "text" name = "price"><br>
<botton type = "submit">EDIT </botton><br>
<a href = "ModifyByPrice.jsp">Continue</a>
<a href = "success.jsp">Go Back</a>
 
</form>
</body>
</html>