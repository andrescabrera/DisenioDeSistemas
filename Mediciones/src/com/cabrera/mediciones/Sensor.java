package com.cabrera.mediciones;

/**
 * @version 1.0
 * @created 17-may-2012 08:26:49 p.m.
 */
public abstract class Sensor {

	public Estacion estacion;
	public ICapturador capturador;

	public abstract void detener();
	public abstract void getFrecuencia();
	public abstract void iniciar();
	public abstract void prepararHardware();
	public abstract void realizarSondeo();
	/**
	 * 
	 * @param capturador
	 */
	public void setFormaCapturar(ICapturador capturador)
	{
		this.capturador = capturador;
	}
	
	public ICapturador getFormaCapturar()
	{
		return capturador;
	}
}