<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/styleNewProdotto.css" />
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<div class="center">
	<p>Nome: ${prodottoForm.nome}</p>
	<p>Descrizione: ${prodottoForm.descrizione}</p>
	<p>Prezzo: ${prodottoForm.prezzo}</p>
	<p>Sei sicuro di voler procedere con questi dati?</p>
	<p>
		<a href="confermaProdotto"> Conferma Definitiva </a>
	</p>
	</div>
</body>
</html>