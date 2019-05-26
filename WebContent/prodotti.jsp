<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Elenco Prodottii</h1>
	<table>
	<tr><th>Nome</th> <th>Descrizione</th></tr>
		<c:forEach var="prodotto" items="${prodotti}">
			<tr>
				<td>${prodotto.nome}</td>
				<td><a href="prodottoController?id=${prodotto.id}">${prodotto.nome}</a></td>
			</tr>
	</c:forEach>
	</table>

</body>
</html>