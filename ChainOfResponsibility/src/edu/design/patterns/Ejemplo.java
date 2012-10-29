package edu.design.patterns;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IHandler gerente = new Employee("gerente", 1000, null);
		IHandler jefe = new Employee("Jefe", 500, gerente);
		IHandler empleado = new Employee("Indio", 100, jefe);

		Request req = new Request(450);
		try {
			empleado.Handle(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
