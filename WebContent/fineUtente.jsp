<%@ page language="java" contentType="text/html;
charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/styleLoginUtente.css" />
<meta charset="UTF-8">
<title>Inserisci il titolo</title>
</head>
<body>
	<div class="center">
		<p>
		<h4>I tuoi dati salvati sono:</h4>
		<p>Nome: ${utenteForm.nome}</p>
		<p>Cognome: ${utenteForm.cognome}</p>
		<p>Data di nascita: ${utenteForm.nascita}</p>
		<p>Email: ${utenteForm.email}</p>
		<ul><li><a href="index.html">Ritorna alla Home</a></li></ul>
	</div>
</body>
</html>