<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>default</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Номер покемона</th>
                <th>Имя покемона</th>
                <th>URL покемона </th>
            </tr>
            <c:forEach items="${pokemonList}" var="pokemon" >
                <tr>
                    <td>${pokemon.id}</td>
                    <td>${pokemon.name}</td>
                    <td><a href = "${pokemon.url}"</a> ${pokemon.url}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>