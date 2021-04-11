<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CONNECTION</title>
<style>
	table{
		border:solid 1px blue;
		margin:15px auto;
		padding:5px;
	}
	tr,td{
		padding:5px;
	}
	h1{
		margin:3px auto;
		text-align:center;
		color:blue;
	}
</style>
</head>
<body>
<h1><fmt:message key="titreConnexion" /> </h1>
<form action = "connection" method = "POST">
	<table>
		<tr>
			<td><fmt:message key="email" /> </td>
			<td><input type = "email" name="email" > </td>
		</tr>
		<tr>
			<td><fmt:message key="motDePasse" /> </td>
			<td><input type = "password" name = "password"> </td>
		</tr>
		<tr>
			<td colspan="2"><center><input type = "submit" value = "<fmt:message key="seconnecter" />"></center></td>
		</tr>
	</table>
</form>
</body>
</html>