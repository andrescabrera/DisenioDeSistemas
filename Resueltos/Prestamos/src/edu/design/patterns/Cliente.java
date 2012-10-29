package edu.design.patterns;

public class Cliente {
	private int edad;
	private String nombre;
	private float sueldo;
	private boolean esAutonomo = false;

	public Cliente(String nombre, int edad, float sueldo, boolean esAutonomo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.esAutonomo = esAutonomo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setEsAutonomo(boolean esAutonomo) {
		this.esAutonomo = esAutonomo;
	}

	public boolean isEsAutonomo() {
		return esAutonomo;
	}

}
