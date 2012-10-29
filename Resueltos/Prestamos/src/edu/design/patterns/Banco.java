package edu.design.patterns;

public class Banco {

	public Prestamo darPrestamo(Cliente cliente) throws Exception
	{
		if (cliente.getEdad() < 18)
			throw new Exception("No puede ser menor de edad");
		return new Prestamo(cliente, 1000, (float) 0.05, 120);
	}
	
}
