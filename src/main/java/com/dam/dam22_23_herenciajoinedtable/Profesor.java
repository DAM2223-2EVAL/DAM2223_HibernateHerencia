package com.dam.dam22_23_herenciajoinedtable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Profesor extends Persona{
	
	@Column
	private int numCiclosClase;

	public Profesor(String dni, String nombre, int edad, int numCiclosClase) {
		super(dni, nombre, edad);
		this.numCiclosClase = numCiclosClase;
	}

	public int getNumCiclosClase() {
		return numCiclosClase;
	}

	public void setNumCiclosClase(int numCiclosClase) {
		this.numCiclosClase = numCiclosClase;
	}
	

}
