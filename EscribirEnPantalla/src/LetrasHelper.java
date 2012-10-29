import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LetrasHelper {
	
	private int cantidadCaracteresEnviados = 0;
	private FactoryLetras factoryLetras;
	
	public void setFactoryLetras(FactoryLetras factoryLetras) {
		this.factoryLetras = factoryLetras;
	}

	public int getCantidadCaracteresEnviados() {
		return cantidadCaracteresEnviados;
	}

	public int contadorDePeso (Letra[] letras) {
		Set<Letra> letrasContadas = new HashSet<Letra>();
		
		int total = 0;
		for(Letra letra : letras)
		{
			if(letrasContadas.contains(letra))
				System.out.println("ya existe");
			else
				total += letra.getPeso();
			letrasContadas.add(letra);
		}
		return total;		
	}
	
	public Letra[] stringToLetras (String texto)
	{
		Letra[] letrasArray = new Letra[texto.length()];
		
		for (int i = 0; i < texto.length(); i++) {
			Letra nuevaLetra = factoryLetras.getLetra(texto.charAt(i));
			letrasArray[i] = nuevaLetra;
			cantidadCaracteresEnviados++;
		}
		
		return letrasArray;
	}
	
	public int getCantidadLetrasDisponibles() {
		return factoryLetras.getCantidadLetrasDisponibles();
	}
}
