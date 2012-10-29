package com.cabrera.mediciones;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @version 1.0
 * @created 17-may-2012 08:26:48 p.m.
 */
public class Central {

	private static Central instancia; 
	private Set<Estacion> listaEstaciones = new HashSet<Estacion>();

	private Central() { }

	public static Central getInstance(){
		if(instancia == null)
			instancia = new Central();
		return instancia;		
	}

	/**
	 * 
	 * @param estacion
	 */
	public void agregarEstacion(Estacion estacion){
		listaEstaciones.add(estacion);
	}

	/**
	 * 
	 * @param estacion
	 */
	public void removerEstacion(Estacion estacion){
		listaEstaciones.remove(estacion);
	}

}