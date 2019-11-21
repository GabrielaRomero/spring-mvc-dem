package com.gabriela.springdemo.mvc.validacionesAnotaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator  
	   implements ConstraintValidator<CourseCode, String>{
	
	
	private String[] coursePrefix;
	
	
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value(); //accede a anotacion dada.
	}

	@Override
	//entra el codigo que ingresa el usuario al form, parametro para dar mensajes de error
	public boolean isValid(String theCode, 
						ConstraintValidatorContext theConstraintValidatorContext) {
		
					
			boolean result = false;
			        
			        if (theCode != null) {
			            
			            //
			            // loop thru course prefixes
			            //
			            // check to see if code matches any of the course prefixes
			            //
			            for (String tempPrefix : coursePrefix) {
			                result = theCode.startsWith(tempPrefix);
			                
			                // if we found a match then break out of the loop
			                if (result) {
			                    break;
			                }
			            }
			        }
			        else {
			            result = true;
			        }
			        
			        return result;
		
		
		
		
//
//		boolean result;
//		
//		if (theCode != null) {
//			result = theCode.startsWith(coursePrefix);
//		}
//		else {
//			result = true;
//		}
//		
//		return result;
	}

	
}
