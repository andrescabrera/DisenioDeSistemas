package edu.design;

public interface Maquina {
	void habilitar();
	void deshabilitar();
	void recibirMoneda(int centavos);
	int getSaldo();
	void dispensarBebida(int codigo);
	int getVasosRestantes();
	void recargarVasos(int cantidad);
	int getCantidadBebidas();
}
