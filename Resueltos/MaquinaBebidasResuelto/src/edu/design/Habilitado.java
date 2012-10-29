package edu.design;


public class Habilitado implements Estado {
	public int calcularNuevoSaldo(Maquina context, int centavos) {
		return context.getSaldo() + centavos;
	}
}
