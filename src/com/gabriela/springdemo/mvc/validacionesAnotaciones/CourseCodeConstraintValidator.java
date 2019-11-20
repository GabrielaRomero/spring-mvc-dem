package com.gabriela.springdemo.mvc.validacionesAnotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator  
	   implements ConstraintValidator<CourseCode, String>{
	private String coursePrefix;
	
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value(); //accede a anotacion dada.
	}

	@Override
	//entra el codigo que ingresa el usuario al form, parametro para dar mensajes de error
	public boolean isValid(String theCode, 
						ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result;
		
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		
		return result;
	}

	
}
