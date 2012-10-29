package edu.design;

public class FueraDeServicio implements Estado {

	public int calcularNuevoSaldo(Maquina context, int centavos){
		System.out.println("Perdon...estoy fuera de servicio");
		System.out.println("Te devuelvo las monedas...");
		return 0;
	}

}
