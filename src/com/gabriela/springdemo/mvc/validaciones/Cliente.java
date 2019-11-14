package com.gabriela.springdemo.mvc.validaciones;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {
	
	@NotNull(message="es requerido")
	@Size(min=2)
	private String nombre;
	private String apellido;
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	

}
