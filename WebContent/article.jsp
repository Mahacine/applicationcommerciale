<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Détails article</title>
<style>
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
</style>
</head>
<body>
	<h1><fmt:message key="detail" /></h1>
	<table>
		<tr>
			<td><fmt:message key="reference" /> </td>
			<td><input type="text" value="${article.codeArticle}" ReadOnly /> </td>
		</tr>
		<tr>
			<td><fmt:message key="auteur" /> </td>
			<td><input type="text" value="${article.auteur}" ReadOnly /> </td>
		</tr>
		<tr>
			<td><fmt:message key="quantite" />  </td>
			<td><input type="text" value="${article.stock}" ReadOnly /></td>
		</tr>
		<tr>
			<td><fmt:message key="titre" />  </td>
			<td><input type="text" value="${article.designation}" ReadOnly /> </td>
		</tr>
		<tr>
			<td><fmt:message key="prix" />  </td>
			<td><input type="text" value="${article.prix}" ReadOnly /> </td>
		</tr>
		<tr>
			<td colspan="2"><center><a href="catalog?client=${client}"><fmt:message key="retour" /> </a></center></td>
		</tr>
	</table>
</body>
</html>