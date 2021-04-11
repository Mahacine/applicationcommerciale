<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inscription</title>
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
		div{
			color:red;
			text-align:center;
		}
	</style>
</head>
<body>

<form action = "registration"  method = "POST">
	<table>
		<tr>
			<td><fmt:message key="nom" /> </td>
			<td><input type = "text" name = "nom"> </td>
		</tr>
		<tr>
			<td><fmt:message key="prenom" /> </td>
			<td><input type = "text" name = "prenom"> </td>
		</tr>
		<tr>
			<td><fmt:message key="adresse" />  </td>
			<td><input type = "text" name = "adresse"></td>
		</tr>
		<tr>
			<td><fmt:message key="code" />  </td>
			<td><input type = "text" name ="codepostal"> </td>
		</tr>
		<tr>
			<td><fmt:message key="ville" />  </td>
			<td><input type = "text" name ="ville"></td>
		</tr>
		<tr>
			<td><fmt:message key="tel" /> </td>
			<td><input type = "text" name ="tel"> </td>
		</tr>
		<tr>
			<td><fmt:message key="email" />  </td>
			<td><input type = "email" name = "email" required> </td>
		</tr>
		<tr>
			<td><fmt:message key="motDePasse" />  </td>
			<td><input type = "password" name ="password" required> </td>
		</tr>
		<tr>
			<td colspan="2"><center><input type = "submit" value="<fmt:message key="sinscrire" />" ></center></td>
		</tr>
	</table>
</form>
<div>
   *<fmt:message key="pass" /></br>
   *<fmt:message key="mail" />
</div>
</body>
</html>