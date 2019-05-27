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
			<input type="text" placeholder="Nome" name="nome" value="${param['nome']}">
			<span class="error"> ${nomeErr} </span>
			<input type="text" placeholder="Prezzo" name="prezzo" value="${param['prezzo']}">
			<span class="error"> ${prezzoErr} </span>
			 <input	type="text" placeholder="Descrizione" name="descrizione" value="${param['descrizione']}">
			 <span class="error"> ${descErr} </span>
			  <input type="submit" value="Prosegui">
		</div>
		<div class="shadow"></div>
	</form>
</body>
</html>