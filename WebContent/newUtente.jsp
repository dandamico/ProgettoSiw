<!DOCTYPE html>
<html lang = "it">
<head>
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/styleLoginUtente.css" />
<!-- Colleghiamo la nostra form alla nostra pagina di stile -->
<title>Inserimento dati</title>
</head>
<body> 
<div class="center">
	<form action="utenteController" method="post">
		<h3>REGISTRATI PER CONTINUARE</h3>
		<br>
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
</body>
</html>