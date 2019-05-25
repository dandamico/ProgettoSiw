<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/styleNewProdotto.css" />
<title>INSERIMENTO NUOVO PRODOTTO</title>
</head>
<body>
	<form action="prodottoController" method="post">
		<div class="Inserimento">
			<input type="text" placeholder="Nome" id="nome">
			<input type="number" placeholder="Prezzo" id="prezzo">
			 <input	type="text" placeholder="Descrizione" id="descrizione">
			  <input type="submit" value="Prosegui">
		</div>
		<div class="shadow"></div>
	</form>

</body>
</html>