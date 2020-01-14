<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addProduct" method="post">
Name: <input type="text" name="productName"><br>
Price: <input type="number" name="price"><br>
Release Date: <input type="date" name="releaseDate"><br>
<input type="submit" value="Create Product">

</form>
</body>
</html>