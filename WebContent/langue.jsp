<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
	form{
		border:solid blue 1px;
		margin:15px auto;
		padding:20px;
		width:60%;
		text-align:center;
	}
</style>
</head>
<body>
	<h1 style="color:Green; text-align:center">Langue</h1>
	<form method="post" action="language">
		<select name="langue">
			<option value="fr_FR" >Français</option>
			<option value="en_US" >English</option>
		</select><br /><br />
		<input type="submit" value="Choisir la langue souhaitée " />
	</form>
</body>
</html>