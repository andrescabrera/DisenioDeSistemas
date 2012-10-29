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
public class MediadorConcreto extends Mediador {
	private Amigo amigoJuan = null;
	private Amigo amigoPedro = null;
	
	public void setAmigoJuan(Amigo amigoJuan) {
		this.amigoJuan = amigoJuan;
	}
	
	public void setAmigoPedro(Amigo amigoPedro) {
		this.amigoPedro = amigoPedro;
	}
	
	public void enviarTexto(String texto, Amigo amigo) {
		if(amigo.equals(amigoJuan)) {
			amigoPedro.recibirTexto(texto);
		} else if(amigo.equals(amigoPedro)) {
			amigoJuan.recibirTexto(texto);
		}
	}

}
