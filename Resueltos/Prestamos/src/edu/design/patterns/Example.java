package edu.design.patterns;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cliente = new Cliente("Juan", 17, (float)5000, false);
		try {
			Prestamo prestamo = banco.darPrestamo(cliente);
			System.out.println("Se otorgo el prestamo por un capital de " + prestamo.getCapital());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
