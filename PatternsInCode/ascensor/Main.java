public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ascensor miAscensor = new Ascensor();
		crearPisos(miAscensor);

		/* Llama al ascensor que esta en el piso 0 (PB) para que suba al 4to piso */
		for (int i = 0; i < 4; i++) {
			miAscensor.setPisoActual(i);
		}
	}

	/**
	 * Crea los pisos y los agrega como observadores del Ascensor.
	 * 
	 * @param miAscensor Observable
	 * */
	private static void crearPisos(Ascensor miAscensor) {
		for (int nroDePiso = 1; nroDePiso < 71; nroDePiso++) {
			miAscensor.addObserver(new Piso(nroDePiso));
		}
	}

}
