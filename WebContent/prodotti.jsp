<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista prodotti</title>
</head>
<body>
	<h1>Elenco Prodotti</h1>
	<table>
		<tr>
			<th>Nome</th>
			<th>Descrizione</th>
			<th>Prezzo</th>
		</tr>
		<c:forEach var="prodotto" items="${prodotti}">
			<tr>
				<td><a href="prodottoController?id=${prodotto.nome}">${prodotto.nome}</a></td>
				<td>${prodotto.descrizione}</td>
				<td>${prodotto.prezzo}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>