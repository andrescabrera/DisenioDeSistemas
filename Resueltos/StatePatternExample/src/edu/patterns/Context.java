package edu.patterns;

public class Context {
	private Airport airport = Ezeiza.getInstance();
	
	public void SetAirport(Airport airport)
	{
		this.airport = airport;	
	}
	
	public void IrEste()
	{
		this.airport.volarEste(this);
	}
	
	public void IrOeste()
	{
		this.airport.volarOeste(this);
	}
	
	public void SayWhereAmI()
	{
		System.out.println("Actualmente estoy en " + this.airport.getName());
	}
}
