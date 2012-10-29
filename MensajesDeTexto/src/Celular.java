
public class Celular {
	private int numero;
	private Antena antena;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public Celular(int numero, Antena antena) {
		super();
		this.numero = numero;
		this.antena = antena;
		antena.agregarCelular(this);
	}
	
	public void enviarMensaje(Mensaje m) {
		if(antena.consultarPorCelular(m.getDestinatario()) != null)
			System.out.println(m);
		else
			System.out.println("Remitente invalido");
	}
	
}
