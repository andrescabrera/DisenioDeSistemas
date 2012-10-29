package edu.patterns;

public class Ezeiza extends Airport {
	
	private static Airport instance = null;
	
	protected Ezeiza() {
		super("Ezeiza");
	}

	
	public static Airport getInstance() {
		if (Ezeiza.instance == null)
			Ezeiza.instance = new Ezeiza();
		return Ezeiza.instance;
	}

	public void volarEste(Context context) {
		System.out.println("Mas al este no se puede");
	}


	public void volarOeste(Context context) {
		context.SetAirport(Cordoba.getInstance());
		
	}

}
