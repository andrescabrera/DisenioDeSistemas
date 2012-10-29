package edu.design.patterns;

//Al que utiliza la clase Utils le corto los dedos... 
//para que opien y peguen la logica. 

public class Utils {

	private static char[] cipher = new char[] { 'X', 'B', 'W', 'E', 'F', 'G',
			'S', 'H', 'J', 'T', 'K', 'Y', 'L', 'M', 'N', 'A', 'O', 'P', 'Q',
			'D', 'R', 'C', 'U', 'V', 'I', 'Z' };

	public static String encryptMessage(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			result += encryptChar(msg.charAt(i));
		}
		return result;
	}

	private static char encryptChar(char c) {
		c = Character.toUpperCase(c);
		if (Character.isLetter(c)) {
			int i = (int) (c - 'A');
			if (i > cipher.length - 1)
				return c;
			else
				return cipher[i];
		} else
			return c;
	}
}
