<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/style.css"/> 
<title>INSERIMENTO PRODOTTO</title>
</head>
<body>
		<form action="prodottoController" method="post">
		
		Nome : <input type="text" name="nome" value= "${param['nome']}" /> 
		<span class="error">  ${nomeErr}
			</span>
		<div></div>
		
		Descrizione : <input type="text" name="descrizione" value="${param['descrizione']}" /> 
		<span class="error"> ${descErr}
		</span>		
		<div></div>
		
		Prezzo : <input type="number" name="prezzo" value="${param['prezzo']}" /> 
		<span class="error"> ${prezzoErr}
		</span>		
		<div></div>
		
		<input type="submit" value="Invio">
	</form>

</body>
</html>