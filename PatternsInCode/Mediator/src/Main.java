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
public class Main {

	public static void main(String[] args) {
		MediadorConcreto mediador = new MediadorConcreto();
		Amigo ammigoJuan = new AmigoConcreto("Juan", mediador);
		Amigo amigoPedro = new AmigoConcreto("Pedro", mediador);
		
		mediador.setAmigoJuan(ammigoJuan);
		mediador.setAmigoPedro(amigoPedro);
		
		ammigoJuan.enviarTexto("Hola todo ok?");
		amigoPedro.enviarTexto("Si todo ok!!!");
		
		
	}
}
