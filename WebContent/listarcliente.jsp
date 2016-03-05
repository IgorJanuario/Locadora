<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList,
        br.com.locadora.jdbc.dao.ClienteDAO,
        br.com.locadora.jdbc.model.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<jsp:useBean id="contato" class="br.com.locadora.jdbc.dao.ClienteDAO"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="css/lista.css" rel="stylesheet" />
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>RG</td>
			<td>CPF</td>
			<td>Telefone</td>
			<td>Sexo</td>
			<td>E-mail</td>
			<td>Data de Nascimento</td>
			<td>Numero de Registro</td>
			<td>Estado Emissor</td>
			<td>Data de Validade CNH</td>
		</tr>
	</table>
	<core:out value="Oi"></core:out>
</body>
</html>