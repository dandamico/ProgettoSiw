<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="CSS/style.css" />
<link rel="stylesheet" href="CSS/styleLogin.css" />
<!-- Colleghiamo la nostra form alla nostra pagina di stile -->
<title>INSERIMENTO CREDENZIALI:</title>
<body bgcolor="#293133">
	<form action="adminController" method="post">
		<div class="login">
			<input type="text" placeholder="Email" name="email"> 
			<span class="error">  ${emailErr}
			</span>
			<div></div>
			<input type="password" placeholder="password" name="password">
			<span class="error">  ${passErr}
			</span>
			 <input type="submit" value="LOGIN">
				
		</div>
		<div class="shadow"></div>

	</form>
</body>
</head>
</html>


<!--  PAGINA JSP E' UNA PAGINA DINAMICA! -->
<!-- value = "${variabile} si mantengono le variabili inserite 
alternativa: < %out.print(request.getParameter("nome"));% >" -->