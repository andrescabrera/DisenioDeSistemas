package edu.patterns;


public abstract class Airport {

	private String name;
	
	protected Airport(String name)
	{
		this.name = name;	
	}
	
	public abstract void volarEste(Context context);
	public abstract void volarOeste(Context context); 

	public String getName() {
		return name;
	}
}

