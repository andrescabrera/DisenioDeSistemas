package edu.design.patterns;

public class clientesDAO {
	public static Cliente getClienteByID(int id) {
		if (id == 10)
			return new Cliente("Martin Fowler", "Thoughtworks",
					"Carlos Calvo 2500 (1015) - Ciudad Autonoma de Buenos Aires",
			"30-26554610-8");
		else
			return null;
	}
}
