package edu.design.patterns;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		INewsAgency reuters = new Reuters();
		Clarin diario = new Clarin(reuters);
		SportsBlog blog = new SportsBlog(reuters);
		
		reuters.notifyEvent("El equipo de Argentino Jrs. ers campeon del torneo clausura 2010");
		reuters.notifyEvent("En el congreso no labura nadie");
		reuters.notifyEvent("El equipo Ferrari esta listo para esta temporada y presentara sus nuevos pilotos");
	}

}
