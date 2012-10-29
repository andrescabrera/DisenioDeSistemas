package edu.patterns;

public class Mendoza extends Airport {

	private static Airport instance = null;
	
	protected Mendoza() {
		super("Mendoza");
	}

	public static Airport getInstance()
	{
		if (Mendoza.instance == null)
			Mendoza.instance = new Mendoza();
		return Mendoza.instance;
	}
	
	
	
	public void volarEste(Context context) {
		context.SetAirport(Ezeiza.getInstance());
	}

	public void volarOeste(Context context) {
		//throw new Exception("No se puede viajar mas al este que Mendoza");
		System.out.println("No se puede viajar mas al oeste que Mendoza");
	}

}
