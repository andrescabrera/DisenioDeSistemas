import java.util.HashMap;


public class FactoryLetrasBasico implements FactoryLetras {

	private HashMap<Character, Letra> mapaLetras = new HashMap<Character, Letra>();
	
	public int getCantidadLetrasDisponibles () {
		return mapaLetras.size();
	}
	
	public Letra getLetra (char c) {
		Letra l = null;
		if(mapaLetras.containsKey(c))
		{
			l = mapaLetras.get(c);
			//seteo l con la instancia de la Letra del sacandola del hashmap
		}
		else
		{
			//instancio la letra
			//la agrego al HashMap y la seteo en l
			l = new Letra(c);
			mapaLetras.put(c, l);
		}
		
		return l;
	}
}
