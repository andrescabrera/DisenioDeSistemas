
public class Habilitado implements Estado {

	public void ingresarMoneda(int valor, Maquina maquina) {
		maquina.setSaldo(maquina.getSaldo() + valor);
	}

	public void realizarPedido(Maquina maquina) {
		tirarElVaso();
		tirarBebida(maquina);
		maquina.changePuerta();
	}

	public void seleccionarBebida(Maquina maquina, String nombre) {
		maquina.setBebida(nombre);
	}
	
	private void tirarElVaso(){
		System.out.println("Tire el vaso");		
	}
	
	private void tirarBebida(Maquina maquina){
		System.out.println("Tire la bebida " + maquina.getBebida());
	}

}
