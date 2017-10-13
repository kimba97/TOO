<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
         <title>Home</title>
        <meta charset=UTF-8" />
        <meta name="viewport" content="width=device-width, 
	user-scalable=no, initial-scale=1, maximum-scale=1, mainimum-scale=1">
        <link rel="stylesheet" href="<c:url value="/public/css/inicio.css" />" />
     </head>
    <body>
       <body>
	<form action="">
		<h2 id="h2">Iniciar sesión</h2>
		<input type="text" placeholder="&#128272; usuario" name="">
		<input type="password" placeholder="&#128272; contraseña" name="">
		<input type="submit" value="ingresar" name="">
	</form>
    </body>
</html>