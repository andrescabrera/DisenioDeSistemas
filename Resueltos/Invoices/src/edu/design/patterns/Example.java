package edu.design.patterns;

import java.util.Date;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente martinFowler = new Cliente("Martin Fowler", "Thoughtworks",
				"Carlos Calvo 2500 (1015) - Ciudad Autonoma de Buenos Aires",
		"30-26554610-8");
		float total = (float) 50000;
		Factura factura = new Factura(martinFowler, total, new Date());
		Impresora impresora = new Impresora();
		impresora.Imprimit(factura);

	}

}
