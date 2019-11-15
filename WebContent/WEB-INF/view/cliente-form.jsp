<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Custumer Registration Form</title>
		
		<style type="text/css">
			.error {color:red}
		</style>
	</head>
	<i>Los campos marcados con (*) son obligatorios</i>
	<br>
	<br>	
	
	<body>
		<form:form action="processForm" modelAttribute="modeloCustumer">
		
			first name(*): <form:input path="nombre"/>
			<form:errors path="nombre"  cssClass="error"></form:errors>
			
			<br>
			<br>
			
			Last name <form:input path="apellido"/>
			
			<br>
			<br>
			
			Free passes: 
			<form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"></form:errors>
			
			<br>
			<br>
			
			Codigo postal: 
			<form:input path="codigoPostal"/>
			<form:errors path="codigoPostal" cssClass="error"></form:errors>
			
			<input type="submit" value="Enviar">
		</form:form>
	
	</body>

</html>