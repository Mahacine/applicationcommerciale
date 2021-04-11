<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="Model.Article" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Catalogue</title>
	<style>
		table{
			margin:10px auto;
		}
		table,tr,td{
			border:solid 2px black;
		}
		td{
			padding:15px;
		}
		h1,h3{
			text-align:center;
		}
		form{
			text-align:center;
		}
	</style>
</head>
<body>
	<h1>Catalogue</h1>
	<h3><fmt:message key="categorie" /> : <%= request.getAttribute("cat") %></h3>
	<form method="post" action="catalog?client=${client_id }">
		<select name="categorie">
			<option value="jazz" >Jazz</option>
			<option value="blues" >Blues</option>
		</select>
		<input type="submit" value="<fmt:message key="choisir" />" />
	</form>
	<table>
		<tr>
			<td><fmt:message key="reference" /></td>
			<td><fmt:message key="titre" /></td>
			<td><fmt:message key="auteur" /></td>
			<td><fmt:message key="prix" /></td>
			<td><fmt:message key="panier" /></td>
		</tr>
		<c:forEach var="article" items="${articles}">
			<tr>
				<td><a href="article?link=${article.codeArticle }&client=${client_id }">${article.codeArticle }</a></td>
				<td>${article.designation }</td>
				<td>${article.auteur }</td>
				<td><fmt:formatNumber value="${article.prix}" type="currency" /></td>
				<td><a href="chart?product=${article.designation }&client=${client_id }"><fmt:message key="ajouter" /> </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>