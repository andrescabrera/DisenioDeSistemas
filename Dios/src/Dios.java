import java.util.Random;


public class Dios {
	
	private int cantidadDeseos; 
	private String nombre;
	
	private static Dios dios;
	
	private Dios () {
		Random random = new Random();
		nombre = "Dios numero: " + random.nextInt(10);
	}
	
	public static Dios crearDios () {
		
		if(dios == null) {
			dios = new Dios();
		}
		
		return dios;
	}
	
	public void recibirDeseo(Deseo deseo) {
		System.out.println("Recibi un deseo: " + deseo.getMensaje());
		cantidadDeseos++;
	}

	public int getCantidadDeseos() {
		return cantidadDeseos;
	}
	
	public Persona crearPersona () {
		Persona pepe = new Persona();
		return pepe;
	}
	
	public String getNombre() {
		return nombre;
	}	
}
