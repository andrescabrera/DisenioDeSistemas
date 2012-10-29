/*
 * Created on 10/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Concesionaria {
	public boolean verificarVentaDirectaDeAuto(Auto auto, Cliente cliente) {
		boolean venta = true;
		Banco banco = new Banco();
		
		if(banco.calcularCreditoMaximo(cliente) < auto.getPrecio()) {
			venta = false;
		}
		
		FabricaDeAutos fabricaDeAutos = new FabricaDeAutos();
		venta = fabricaDeAutos.hayEnStock(auto);
		
		EmpresaDeTransporte empresaDeTransporte = new EmpresaDeTransporte();
		venta = empresaDeTransporte.puedeEntregarAuto(auto, cliente);
		
		return venta;
		
	}
}
