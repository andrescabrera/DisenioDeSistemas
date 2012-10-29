package edu.design;

public class CafeLargo implements Bebida {

	public void preparar(Dispenser dispenser) {
		dispenser.agregarCafeAlVaso();
		dispenser.agregarCafeAlVaso();
		dispenser.agregarAguaAlVaso();
		dispenser.agregarAzucarAlVaso();
	}

	public Integer getCodigo() {
		return new Integer(1);
	}

}
