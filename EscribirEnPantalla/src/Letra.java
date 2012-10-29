
public class Letra {
	
	private char glifo;
	
//	public Letra(char glifo) throws Exception {
	public Letra(char glifo) {
		super();
		
//		if(glifo == null)
//			throw new Exception("El glifo no puede ser nulo.");
		
		this.glifo = glifo;
	}

	public char getGlifo() {
		return glifo;
	}
	
	public int getPeso() {
		return 5;
	}
	
//	public char toString () {
//		return glifo;		
//	}
}
