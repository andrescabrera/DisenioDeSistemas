
public class Mensaje {
	private String texto;
	private int destinatario;
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Mensaje(String texto, int destinatario) {
		super();
		this.texto = texto;
		this.destinatario = destinatario;
	}
	public void setDestinatario(int destinatario) {
		this.destinatario = destinatario;
	}
	public int getDestinatario() {
		return destinatario;
	}
	
	public String toString() {
		return "para: " + destinatario + " mensaje: " + texto;
	}
}
