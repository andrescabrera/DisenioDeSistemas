package edu.design.patterns;

import java.util.Date;

public class Factura {

	private Cliente cliente;
	private float total;
	private Date vencimiento;

	/*
	 * los items de la factura etc etc
	 */

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	/**
	 * @param cliente
	 * @param total
	 * @param vencimiento
	 */
	public Factura(Cliente cliente, float total, Date vencimiento) {
		super();
		this.cliente = cliente;
		this.total = total;
		this.vencimiento = vencimiento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getTotal() {
		return total;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

}
