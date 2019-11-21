package com.gabriela.springdemo.mvc.validacionesAnotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	//definir el codigo del curso por default
	//public String value() default "LUV";
	public String[] value() default {"LUV"};
	
	//Defiir el mensaje de error por default
	public String message() default "Debe comensar con LUV";
	
	//Definir los grupos por default
	public  Class<?>[] groups() default {};
	
	//Definir los playloads por default carags utiles
	public Class<? extends Payload>[] payload() default {};
	
	
	
	

}
