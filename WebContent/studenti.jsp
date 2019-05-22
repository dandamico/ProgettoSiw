<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista studenti</title>
</head>
<body>
	<h1>ElencoStudenti</h1>
	<table>
	<tr><th>Nome</th> <th>Cognome</th></tr>
		<c:forEach var="studente" items="${studenti}">
			<tr>
				<td>${studente.nome}</td>
				<td><a href="studenteController/${studente.id}">${studente.cognome}</a></td>
			</tr>
	</c:forEach>
	</table>
</body>
</html>