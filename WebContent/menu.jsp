<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Menu</title>
	<style>
		h2{
			text-align:center;
		}
	</style>
</head>
<body>
	<h2><fmt:message key="bonjour" /> ${client.nom} ${client.prenom} </h2>
	<div style="border:solid blue 1px ;margin: auto 10%; padding:10px 1em; text-align:center">
	     <a href="catalog?client=${client.id}" ><fmt:message key="consulter" /></a><br />
	     <a href="chart?client=${client.id}" ><fmt:message key="visualiser" /></a>
	</div>
</body>
</html>