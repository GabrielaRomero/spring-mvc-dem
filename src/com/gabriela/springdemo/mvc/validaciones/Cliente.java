package com.gabriela.springdemo.mvc.validaciones;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cliente {
	
	@NotNull(message="El campo es requerido")
	@Size(min=2, message="Es requerido el campo :(")
	private String nombre;
	
	
	private String apellido;
	
	@NotNull(message="El campo es requerido")
	@Min(value=0, message="Debe ser mayor o igual a cero")
	@Max(value=10, message="Debe ser menor o iguala  10")
	private Integer freePasses;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}" , message="Solo 5 cacracteres/digitos")
	private String codigoPostal;
	
	
	
	
	
	
	
	
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	

}
