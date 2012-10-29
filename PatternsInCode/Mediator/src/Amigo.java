/*
 * Created on 05/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class Amigo {


	private String nombre;
	private Mediador mediador;
	
	public Amigo(String nombre, Mediador mediador) {
		this.nombre = nombre;
		this.mediador = mediador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMediador(Mediador mediador) {
		this.mediador = mediador;
	}
	
	public Mediador getMediador() {
		return mediador;
	}
	
	public abstract void enviarTexto(String texto);
	
	public abstract void recibirTexto(String texto);
	
}
