package edu.design.patterns;
//http://en.wikipedia.org/wiki/Enigma_machine

/**
 * @author Julian Werba
 *
 */

public class EnigmaMachine {
	
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
		String text = message.getSender() + "#" + message.getRecipient() + "#" + message.getText();
		//2) Cifra ese texto
		text = cipher(text);
		//3) Envia el texto cifrado a la "red" de maquinas enigma (no importa como)
		broadcast(text);
		//4) Imprime el texto cifrado a la consola para que el usuario pueda ver que se envio
		System.out.println(text);
	}
	
	private String cipher(String msg) {
    	String result = "";
    	int k = 1;
    	for (int i = 0; i < msg.length(); i++)
    		result += encryptChar(msg.charAt(i), k);
    	return result;
    }

    private char encryptChar(char c, int k) {
    	c = Character.toUpperCase(c);
    	if (Character.isLetter(c))
    		return (char) ('A' + (c - 'A' + k));
    	else
    		return c;
    }

	private void broadcast(String message)
	{
		//No importa que hace aca... supongamos que lo hace de alguna forma...
	}
}
