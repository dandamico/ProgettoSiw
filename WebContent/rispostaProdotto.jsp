<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<p>Nome: ${prodottoForm.nome}</p>
	<p>Descrizione: ${prodottoForm.descrizione}</p>
	<p>Prezzo: ${prodottoForm.prezzo}</p>
	<p>Sei sicuro di voler procedere con questi dati?</p>
	<p>
		<a href="confermaProdotto"> Conferma Definitiva </a>
	</p>
</body>
</html>