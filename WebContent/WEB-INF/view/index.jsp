<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Make a Dog: </h1>
	<form action= "Dogs" method="GET">
	Name : <input type="text" name="name" /><br>
	Breed: <input type="text" name="breed" /><br>
	Weight: <input type="text" name="weight" /><br>
	
	<input type="submit" value="submit" />
	</form>
	
	<h1>Make a Cat: </h1>
	<form action= "Cats" method="GET">
	Name : <input type="text" name="name" /><br>
	Breed: <input type="text" name="breed" /><br>
	Weight: <input type="text" name="weight" /><br>
	
	<input type="submit" value="submit" />
	</form>
</body>
</html>