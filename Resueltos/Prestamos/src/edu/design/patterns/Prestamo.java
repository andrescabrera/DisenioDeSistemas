package edu.design.patterns;

public class Prestamo {
	private float capital;
	private float tasa;
	private int cuotas;
	private Cliente cliente;

	public Prestamo(Cliente cliente, float capital, float tasa, int cuotas) {
		this.capital = capital;
		this.cliente = cliente;
		this.tasa = tasa;
		this.cuotas = cuotas;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public float getCapital() {
		return capital;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}

	public float getTasa() {
		return tasa;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
