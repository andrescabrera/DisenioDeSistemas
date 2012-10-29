package edu.design.patterns;

public class Impresora {

	public void Imprimit(Factura factura)
	{
		System.out.println(" ---------------   C  ---------------");
		System.out.println("");
		System.out.println("Mr. " + factura.getCliente().getNombre() + " - " + factura.getCliente().getRazonSocial());
		System.out.println(factura.getCliente().getDireccion());
		System.out.println(factura.getCliente().getCuit());
		System.out.println("                                   Total a pagar en $: " + factura.getTotal());
		System.out.println("                                   Vencimiento actual: " + factura.getVencimiento().toString());
		System.out.println(" ------------------------------------");
	}
}
