package edu.design.patterns;

public class CajaDeAhorro {
	private float saldo = 0;
	private Cliente cliente = null;
	
	public CajaDeAhorro(float saldoInicial, Cliente cliente)
	{
		this.saldo = saldoInicial;
		this.cliente = cliente;
	}
	
  public void retirar(float monto) throws Exception{
	  if (monto <= 0) throw new Exception("No puede retirar cantidades negativas");
	  boolean puedeRetirar =(monto <= saldo);
	  
	  if (puedeRetirar == false)
	  {
		  throw new Exception("No tiene saldo suficiente");
	  }
	  else
	  {
		  saldo = saldo - monto;
		  loguearMensaje("Se ha producido un retiro de $" + String.valueOf(monto) + " en la cuenta del cliente " + this.cliente.getNombre());
	  }
	}
  
  private void loguearMensaje(String mensaje)
  {
	  System.out.println(mensaje);
  }


public Cliente getCliente() {
	return cliente;
}
}
