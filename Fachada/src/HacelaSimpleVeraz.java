
public class HacelaSimpleVeraz {
	
	private Veraz veraz;
	
	public boolean puedoOtorgar(String cuit) {
		
		veraz.ingresarNombre("Inventado");
		veraz.verificarCuit(cuit);
		return veraz.consultarEstadoSolicitud();
	}
	
}
