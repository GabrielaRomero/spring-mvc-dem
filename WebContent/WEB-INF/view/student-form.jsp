<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<title>Formulario de Regito de Esudiante</title>
</head>
<body>
	<!--modelAtribute: es el que de definio en el contolador 
	
	  -->
	<form:form action="processForm" modelAttribute="studentModel">
		Nombre <form:input path="nombre" /> <!-- el path es la propiedad o atributo de la calse Esudiante  -->
		Apellido <form:input path="apellido" />
		
		<br>
		<br>
		Country<form:select path="ciudad">
			<form:options items="${theCountryOptions}" />
			
			
			<%-- <form:options items="${studentModel.opcionesCiudad}" /> --%>
			
			
			
			<%-- <form:option value="Brasil" label="Brasil"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="Mexico" label="Mexico"></form:option>
			<form:option value="EUA" label="EUA"></form:option> --%>
		</form:select>
		
		<br>
		<br>
		
		Favorite language:
		
		<form:radiobuttons path="lenguajeFvorito" items="${studentModel.opcionesLenguaje}"/>
		
		
	<%-- 	 JAVA<form:radiobutton path="lenguajeFvorito" value="Java"/>
		 C#<form:radiobutton path="lenguajeFvorito" value="C#"/>
		 PHP<form:radiobutton path="lenguajeFvorito" value="PHP"/>
		 RUBY<form:radiobutton path="lenguajeFvorito" value="Ruby"/>
		 --%>
		 
		 
		 <br>
		 <br>
		 Operating Systems: 
		 Linux <form:checkbox path="sistemaOperativo" value="Linux"/>
		 Windows <form:checkbox path="sistemaOperativo" value="Windows"/>
		 IOS <form:checkbox path="sistemaOperativo" value="IOS"/>
		
		<input type="submit"  value="Enviar"/>
		
	
	</form:form>

</body>

</html>