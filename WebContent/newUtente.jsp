<!DOCTYPE html>
<html lang = "it">
<head>
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/styleLoginUtente.css" />
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
	<h1> <b style="color: #daa800 ;">Registrati per continuare!</b></h1>
	<hr width="20%" style="border: 1px solid #daa800;">
	<br>
	<form action="utenteController" method="post">
		Nome : <input type="text" name="nome" value="${param['nome']}" /> 
		<span class="error"> ${nomeErr} </span>
		<div></div>
		Cognome : <input type="text" name="cognome" value="${param['cognome']}" /> 
		<span class="error"> ${cognomeErr} </span>
		<div></div>
		Data di nascita: <input type="date" name="nascita" value="${param['nascita']}">
		<span class="error"> ${nascitaErr} </span>
		<div></div>
		Email : <input type="text" name="email" value="${param['email']}" /> 
		<span class="error"> ${emailErr} </span>
		<div></div>
		<button>Registrati</button>
	</form>
</div>
</section>
</div>
</body>
</html>