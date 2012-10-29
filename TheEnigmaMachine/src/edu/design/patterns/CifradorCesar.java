package edu.design.patterns;

public class CifradorCesar implements Cifrador {

	@Override
	public String cifrar(String msg) {
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
}
