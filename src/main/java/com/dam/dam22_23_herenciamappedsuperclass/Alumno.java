package com.dam.dam22_23_herenciamappedsuperclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Alumno extends Persona{
	
	@Column
	private String ciclo;

	public Alumno(String dni, String nombre, int edad, String ciclo) {
		super(dni, nombre, edad);
		this.ciclo = ciclo;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	

}
