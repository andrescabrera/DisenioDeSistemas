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
public class AmigoConcreto extends Amigo {

	public AmigoConcreto(String nombre, Mediador mediador) {
		super(nombre, mediador);
	}
	
	public void recibirTexto(String texto) {
		System.out.println(getNombre() + " recibió un texto: " + texto);
	}

	public void enviarTexto(String texto) {
		getMediador().enviarTexto(texto, this);
	}

}
