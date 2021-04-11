<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="messages" />
<fmt:setLocale value="${langue}" scope="session" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Acceuil</title>
	</head>
	<body>
		<h1 style="color:Green; text-align:center"><fmt:message key="welcome" /></h1>
		<div style="border:solid blue 1px ;margin: auto 10%; padding:10px 1em">
		     <a href="entrance?link=seConnecter" ><fmt:message key="identification" /></a><br />
		     <a href="entrance?link=sInscrire" ><fmt:message key="inscription" /></a>
		</div>
	</body>
</html>