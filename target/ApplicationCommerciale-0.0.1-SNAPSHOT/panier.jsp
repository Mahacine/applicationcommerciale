<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chart</title>
</head>
<body>
	<h3>Chart</h3>
	<ol>
		<c:forEach var="article" items="${panier }">
			<li>${article }</li>
		</c:forEach>
	</ol>
</body>
</html>