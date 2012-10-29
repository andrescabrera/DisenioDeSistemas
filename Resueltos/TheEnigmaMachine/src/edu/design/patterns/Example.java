package edu.design.patterns;

public class Example {

	public static void main(String[] args) {
		ejemploDefault();
		
		//ejercicio1();
		//ejercicio2();
	}
	
	
	public static void ejemploDefault()
	{
		EnigmaMachine machine = new EnigmaMachine();
		GermanAgent sigfrid = new GermanAgent("Sigfrid");
		Message m = new Message(sigfrid.getName(), "Hanz", "Wir sind in den Ofen. Jemand nahm die Katze Milch");
		sigfrid.SendMessage(m, machine);
	}
	
	/**
	 * La inteligencia alemana tiene miedo de que le descubran el algoritmo de cifrado de sus maquinas enigma. </br>
	 * Quieren mejorar sus modelos sin tener que ensenarles como usar los nuevos modelos a los agentes de inteligencia. 
	 * A los ojos de los agentes deben usarse de la misma manera. </br>
	 * No quieren dejar de utilizar los modelos actuales, sino quieren hacer modelos con cifrados mas avanzados </br>
	 * que se utilizaran para mensajes mas importantes.
	 * Existe un requerimiento. El grupo de ingenieros que crearon la maquina enigma no disponen de mucho tiempo. </br>
	 * Los ingenieros solo pueden colaborar en realizar una minima modificacion y despues la maquina debe quedar lista </br>
	 * de tal manera que los encargados de lograr que los nuevos modelos de maquinas enigma cifren de formas </br>
	 * mas robustas sean un grupo de matematicos alemanes dedicados a este fin. </br>
	 *  </br>
	 * Realice los cambios (refactorice) para poder lograr el objetivo de tal manera de que ahora los matematicos </br>
	 * puedan encargarse de fabricar maquinas enigma de tal manera de que no sea necesario que  </br>
	 * tengan el conocimiento interno acerca de las maquinas (como concatena el mensaje, como envia, como lo muestra en pantalla, etc.), </br>
	 * sino concentrarse en las nuevas formas de cifrado. </br>
	 */
	public static void ejercicio1()
	{
		
	}

	/**
	 * La solucion del Ejercicio1 funciono, pero tuvo como consecuencia que se multipicaran por n la cantidad de maquinas enigma fabricadas.
	 * Si antes se necesitaban 100 maquinas, al fabricar una segunda version mas segura que se utilizaria para los mensajes mas "secretos",
	 * cada central de espionaje debia tener ahora 2 modelos. Los alemanes vieron que ahora tenian que fabricar y enviar el doble de maquinas a todos lados.
	 * Te han vuelto a convocar para solucionar este problema de ahora en adelante y realizar modificaciones (refactoring) para no sucedad este problema ya que 
	 * estan pensado en modificar el algoritmo de cifrado una tercer vez y no quieren tener 300 maquinas dando vueltas por el mundo 
	 * (pensando que por cada algoritmo nuevo ahora tienen que volver a fabricar la cantidad necesaria de maquinas). 
	 */
	public static void ejercicio2()
	{
		
	}
}
