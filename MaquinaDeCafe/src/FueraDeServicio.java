
public class FueraDeServicio implements Estado {

	public void ingresarMoneda(int valorMoneda, Maquina maquina) {
		System.out.println("Fuera de servicio, tome su vuelto: " + valorMoneda);		
	}

	public void seleccionarBebida(Maquina maquina, String nombreBedbida) {
		System.out.println("Disculpe, maquina fuera de servicio.");		
	}
	
	private void trabarPuerta(Maquina maquina){
		maquina.changePuerta();
	}

	public void realizarPedido(Maquina maquina) {
		trabarPuerta(maquina);
	}

}
