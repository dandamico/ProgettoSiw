<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/style.css"/>  <!-- Colleghiamo la nostra form alla nostra pagina di stile -->
<title>INSERIMENTO DATI:</title>
<body>
	<form action="studenteController" method="post">
		Nome : <input type="text" name="nome" value= "${param['nome']}" /> 
		<span class="error">  ${nomeErr}
			</span>
		<div></div>
		Cognome : <input type="text" name="cognome" value="${param['cognome']}" /> 
		<span class="error"> ${cognomeErr}
		</span>
		<div></div>
		<input type="submit" value="Invio">
	</form>
</body>
</head>
</html>


<!--  PAGINA JSP E' UNA PAGINA DINAMICA! -->
<!-- value = "${variabile} si mantengono le variabili inserite 
alternativa: < %out.print(request.getParameter("nome"));% >" -->