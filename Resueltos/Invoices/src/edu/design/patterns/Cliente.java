package edu.design.patterns;

public class Cliente {

	private String nombre;
	private String razonSocial;
	private String direccion;
	private String cuit;

	/**
	 * @param nombre
	 * @param razonSocial
	 * @param direccion
	 * @param cuit
	 */
	public Cliente(String nombre, String razonSocial, String direccion,
			String cuit) {
		super();
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.cuit = cuit;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

}
