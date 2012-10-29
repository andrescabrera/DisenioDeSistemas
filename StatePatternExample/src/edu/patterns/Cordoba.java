package edu.patterns;

public class Cordoba extends Airport {

	protected Cordoba() {
		super("Cordoba");
	}

	private static Airport instance = null;

	public static Airport getInstance() {
		if (Cordoba.instance == null)
			Cordoba.instance = new Cordoba();
		return Cordoba.instance;
	}


	public void volarEste(Context context) {
		context.SetAirport(Ezeiza.getInstance());
	}

	public void volarOeste(Context context) {
		context.SetAirport(Mendoza.getInstance());

	}

}
