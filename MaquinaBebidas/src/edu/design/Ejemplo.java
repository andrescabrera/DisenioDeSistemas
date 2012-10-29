package edu.design;

import java.lang.reflect.Method;
import java.util.Random;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* NO LE DEN BOLA A ESTO QUE ES MAGIA... */
		Ejemplo e = new Ejemplo();
		Method[] tests = e.getClass().getDeclaredMethods();
		for (int i=0; i < tests.length; ++i) {
			Method m = tests[i];
			if (m.getName().startsWith("testCase"))
				e.runTestCase(m);
		}
	}
	
	private void runTestCase(Method m) {
		try {
			m.invoke(this, null);
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void testCase1() {
		System.out.println("Ejemplo 1: Pidiendo bebida sin poner monedas");
		Maquina m = new MaquinaSimple();		
		m.dispensarBebida(1);
	}
	
	private void testCase2() {
		System.out.println("Ejemplo 2: Pidiendo bebidas");
		Maquina m = new MaquinaSimple();
		m.recibirMoneda(300);
		m.dispensarBebida(1);
	}
	
	private void testCase3() {
		System.out.println("Ejemplo 3: Maquina fuera de servicio");
		Maquina m = new MaquinaSimple();		
		m.deshabilitar();
		m.recibirMoneda(250);
	}

	private void testCase4() {
		System.out.println("Ejemplo 4: Maquina que se queda sin vasos");
		Maquina m = new MaquinaSimple();
		m.recargarVasos(5);
		Random r = new Random();
		for (int i=0; i < 7; ++i) {
			m.recibirMoneda(250);
			int bebidaElegida = 0;
			try { bebidaElegida = r.nextInt(m.getCantidadBebidas()); } catch (Exception ex) {}			
			m.dispensarBebida(bebidaElegida);
			System.out.println("");
		}
	}
}
