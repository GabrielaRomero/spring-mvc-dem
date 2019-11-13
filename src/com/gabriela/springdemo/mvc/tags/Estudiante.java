package com.gabriela.springdemo.mvc.tags;

import java.util.LinkedHashMap;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String ciudad;
	
	private LinkedHashMap<String, String> opcionesCiudad;
	
	private LinkedHashMap<String, String> opcionesLenguaje;
	
	private String lenguajeFvorito;
	
	private String[] sistemaOperativo; 
	
	public Estudiante() {
		
		opcionesCiudad = new LinkedHashMap<>();
		opcionesCiudad.put("EUA", "Estados Unidos");
		opcionesCiudad.put("MEX", "Mexico");
		opcionesCiudad.put("JAM", "Jamaica");
		opcionesCiudad.put("BRA", "Brasil");
		opcionesCiudad.put("FRANCIA", "FRAN");
		
		opcionesLenguaje = new LinkedHashMap<>();
		opcionesLenguaje.put("Ja", "JAVA");
		opcionesLenguaje.put("C", "C");
		opcionesLenguaje.put("Ru", "RUBY");
		opcionesLenguaje.put("JS", "JS");
	}

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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LinkedHashMap<String, String> getOpcionesCiudad() {
		return opcionesCiudad;
	}

	public void setOpcionesCiudad(LinkedHashMap<String, String> opcionesCiudad) {
		this.opcionesCiudad = opcionesCiudad;
	}

	public String getLenguajeFvorito() {
		return lenguajeFvorito;
	}

	public void setLenguajeFvorito(String lenguajeFvorito) {
		this.lenguajeFvorito = lenguajeFvorito;
	}

	public LinkedHashMap<String, String> getOpcionesLenguaje() {
		return opcionesLenguaje;
	}

	public void setOpcionesLenguaje(LinkedHashMap<String, String> opcionesLenguaje) {
		this.opcionesLenguaje = opcionesLenguaje;
	}

	public String[] getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String[] sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	
	
	

}
