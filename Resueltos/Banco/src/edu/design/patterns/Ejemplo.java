package edu.design.patterns;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente juan = new Cliente("Juan");
		CajaDeAhorro cuenta = new CajaDeAhorro(1000, juan);
		
		try {
			cuenta.retirar(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
