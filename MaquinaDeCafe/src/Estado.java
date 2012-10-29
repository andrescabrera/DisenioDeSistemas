
public interface Estado {
	
	void realizarPedido(Maquina maquina);
	void ingresarMoneda(int valorMoneda, Maquina maquina);
	void seleccionarBebida(Maquina maquina, String nombreBedbida);

}
