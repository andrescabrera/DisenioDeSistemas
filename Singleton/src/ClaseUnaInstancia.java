
public abstract class ClaseUnaInstancia {
	
	private static int unNumero = 10; 
	public int otroNumero = 10;
	
	public static void hacerAlgo() {
		System.out.println("Incremento unNUmero: " + unNumero++);
		
		ClaseQueUsaLaEstatica usame = new ClaseQueUsaLaEstatica();
		usame.mostrarMensaje();
		usame.unaVariable = 12;
	}
	
}
