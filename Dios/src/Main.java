
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dios dios = Dios.crearDios();
		System.out.println(dios.getNombre());
		Persona pepe = dios.crearPersona();
		pepe.desear(dios);
		System.out.println("Cantidad de deseos: " + dios.getCantidadDeseos());
		
		Dios dios2 = Dios.crearDios();
		System.out.println(dios2.getNombre());
		System.out.println("Cantidad de deseos: " + dios2.getCantidadDeseos());
	}

}
