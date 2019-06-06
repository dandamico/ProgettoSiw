<!DOCTYPE html>
<html lang="it">
<head>
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/styleNewProdotto.css" />
<!-- Colleghiamo la nostra form alla nostra pagina di stile -->
<title>Inserimento dati</title>
</head>
	<nav>
		<ul>
			<li><a href="index.html">Home</a></li>
		</ul>
	</nav>
<body bgcolor="#293133"> 
<div class="center">
<section class="form">
<div class="center">
	<h1> <b style="color: #daa800 ;">Inserimento prodotto</b></h1>
	<hr width="20%" style="border: 1px solid #daa800;">
	<br>
		<form action="prodottoController" method="post">
			Nome : <input type="text" name="nome" value="${param['nome']}" /> <span
				class="error"> ${nomeErr} </span>
			<div></div>
			Descrizione : <input type="text" name="descrizione"
				value="${param['descrizione']}" /> <span class="error">
				${descErr} </span>
			<div></div>
			Prezzo : <input type="text" name="prezzo" value="${param['prezzo']}" />
			<span class="error"> ${prezzoErr} </span>
			<div></div>
			<input type="submit" value="Invio">
	</form>
</div>
</section>
</div>
</body>
</html>