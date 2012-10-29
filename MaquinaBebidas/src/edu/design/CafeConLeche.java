package edu.design;

public class CafeConLeche implements Bebida {

	public void preparar(Dispenser dispenser) {
		dispenser.agregarCafeAlVaso();
		dispenser.agregarLecheAlVaso();
		dispenser.agregarAguaAlVaso();
	}

	public Integer getCodigo() {
		return new Integer(2);
	}

}
