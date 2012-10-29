package edu.design.patterns;
//http://en.wikipedia.org/wiki/Enigma_machine

/**
 * @author Julian Werba
 *
 */

public class EnigmaV2 {
	
	private Cifrador cifrador;

	public void setCifrador(Cifrador cifrador) {
		this.cifrador = cifrador;
	}

	/** <p>Aunque la maquina enigma original solo cifraba mensajes y nos enviaba. </br>
	 * La nuestra (con motivo de lo queremos aprender) al enviar un mensaje hara lo siguiente:</br>
	 * 1) Concatena el mensaje en 1 sola linea de texto con el formato sender#recipient#texto</br>
	 * 2) Cifra ese texto</br>
	 * 3) Envia el texto cifrado a la "red" de maquinas enigma (no importa como)</br>
	 * 4) Imprime el texto cifrado a la consola para que el usuario pueda ver que se envio</br>
	 *  </p>
	 * @param  message  El mensaje a enviar
	 */
	public void Send(Message message) {
		//1) Concatena el mensaje en 1 sola linea de texto con el formato sender#recipient#texto
		String text = concatenar(message);
		//2) Cifra ese texto
		text = cifrador.cifrar(text);
		//3) Envia el texto cifrado a la "red" de maquinas enigma (no importa como)
		difundir(text);
		//4) Imprime el texto cifrado a la consola para que el usuario pueda ver que se envio
		mostrar(text);
	}
	
	private String concatenar(Message message) {
		String unString = message.getSender() + "#" + message.getRecipient() + "#" + message.getText();
		return unString;	
	}
	
	private void mostrar(String text) {
		System.out.println(text);
	}
	
	private void difundir(String message)
	{
		//No importa que hace aca... supongamos que lo hace de alguna forma...
	}	
	
}
