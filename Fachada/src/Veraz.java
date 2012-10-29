
public class Veraz {
	
	private String nombreCliente;
	private String cuitCliente;
	private boolean debe = true;
	
	public void ingresarNombre(String nombreCliente) {
		System.out.println("Me pasaron " + nombreCliente);
		this.nombreCliente = nombreCliente;
	}
	
	public void verificarCuit(String cuit) {
		System.out.println("Me pasaron el cuit " + cuit);
		this.cuitCliente = cuit;
	}
	
	public boolean consultarEstadoSolicitud () {
		if(this.nombreCliente.length() != 0 && cuitCliente.length() != 0 && debe == false)
			return true;
		return false;
	}
}
