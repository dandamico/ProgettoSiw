<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="center">
		<p>
		<h4>I tuoi dati salvati sono:</h4>
		<p>Nome: ${prodottoForm.nome}</p>
		<p>Prezzo: ${prodottoForm.prezzo}</p>
		<p>Descrizione: ${prodottoForm.descrizione}</p>

		<ul><li><a href="index.html">Ritorna alla Home</a></li></ul>
	</div>
</body>
</html>