package com.fjrg;

public class Persona {

	public String nombre;
	public String apellido;
	public String dni;
	public int edad;
	
	public Persona(String nombre, String apellido, String dni, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
	}
	public void saludar() {
		System.out.printf("Buenas, me llamo %s %s", 
				nombre, apellido
				);
	}
}
