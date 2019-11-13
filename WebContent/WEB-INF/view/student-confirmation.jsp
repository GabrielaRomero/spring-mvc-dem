<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE HTML>

<html>
	<head><title>confirmacion de estudiante</title></head>
	<body>
		El etudiante esta confirmado: ${studentModel.nombre} ${studentModel.apellido}
		<br>
		<br>
		Country:  ${studentModel.ciudad} 
		<br>
		<br>
		Lenguaje favorito: ${studentModel.lenguajeFvorito}
		
		<br>
		<br>
		Sistema operativo:
		
		<ul>
			<c:forEach var="arreglo" items="${studentModel.sistemaOperativo}">
			
				 <li>${arreglo}</li>
				
			
			</c:forEach>
		
		</ul>
		
		
		
	</body>
	