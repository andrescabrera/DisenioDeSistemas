import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		LetrasHelper helper = new LetrasHelper();
		helper.setFactoryLetras(new FactoryLetrasBasico());
		
		Letra[] cadena1 = helper.stringToLetras("Hola mama");
		Letra[] cadena2 = helper.stringToLetras("Yo no tenia ganas de ir a la facultad un jueves a escuchar a estos dos tipos.");
		Pantalla pantalla = new Pantalla();

		pantalla.dibujar(cadena1);
		System.out.println();
		System.out.println("Peso de cadena1: " + helper.contadorDePeso(cadena1));
		
		pantalla.dibujar(cadena2);
		System.out.println();
		System.out.println("Peso de cadena2: " + helper.contadorDePeso(cadena2));
		
		System.out.println("Cantidad total de letras: " + helper.getCantidadLetrasDisponibles());
		System.out.println("Cantidad de caracteres enviados: " + helper.getCantidadCaracteresEnviados());
		
	}
}
