package edu.design;

public class Chocolate implements Bebida {

	public Integer getCodigo() {
		return new Integer(0);
	}

	public void preparar(Dispenser dispenser) {
		dispenser.agregarChocolateAlVaso();
		dispenser.agregarLecheAlVaso();
		dispenser.agregarAzucarAlVaso();
	}

}
