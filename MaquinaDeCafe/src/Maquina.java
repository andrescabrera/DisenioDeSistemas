public class Maquina {
	
	private String bebida;
	private Estado estado;
	private float saldo;
	private boolean puertaTrabada = false;
	private int precioBebidas;
	
	public String getBebida() {
		return bebida;
	}

	protected void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public Estado getEstado() {
		return estado;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void seleccionarBebida(String bebida){
		this.estado.seleccionarBebida(this, bebida);
	}
	
	public void ingresarMoneda(int moneda){
		this.estado.ingresarMoneda(moneda, this);
	}

	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void changePuerta() {
		puertaTrabada = !puertaTrabada;		
	}

	protected void setPrecioBebidas(int precioBebidas) {
		this.precioBebidas = precioBebidas;
	}

	public int getPrecioBebidas() {
		return precioBebidas;
	}
}

