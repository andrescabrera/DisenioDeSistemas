package edu.design;

import java.util.HashMap;

public class MaquinaSimple implements Maquina {

	private final int PRECIO = 250;

	private int vasosRestantes = 3;
	private int saldo = 0;
	private Estado estado = new Habilitado();
	private Dispenser dispenser = new Dispenser();
	private HashMap bebidas = new HashMap();

	private void agregarBebida(Bebida b) {
		bebidas.put(b.getCodigo(), b);
	}

	public MaquinaSimple() {
		agregarBebida(new CafeLargo());
		agregarBebida(new CafeConLeche());
		agregarBebida(new Chocolate());
	}

	public void deshabilitar() {
		this.estado = new FueraDeServicio();
	}

	private void trabarPuertita() {
		System.out.println("Trabando puerta...");
	}

	private void ponerVaso() throws NoQuedanVasitosException {
		vasosRestantes--;
		if (vasosRestantes < 0) {
			throw new NoQuedanVasitosException();
		}
		System.out.println("Poniendo vaso... (quedan " + vasosRestantes + ")");
	}

	private void ponerCucharita() {
		System.out.println("Poniendo cucharita...");
	}

	private void destrabarPuertita() {
		System.out.println("Destrabando puertita");
	}

	public void dispensarBebida(int codigo) {

		if (saldo < PRECIO) {
			System.out.println("Faltan " + (PRECIO - saldo) + " creditos");
			return;
		}

		System.out.println("Pedida la bebida " + codigo);
		try {
			trabarPuertita();
			ponerVaso();
			this.preparaBebida(codigo);
			ponerCucharita();
			this.saldo = 0;
		} catch (NoQuedanVasitosException e) {
			System.out.println("No quedan vasos, te devuelvo el credito");
			this.saldo = 0;
			this.deshabilitar();
		} catch (BebidaNoDisponibleException e) {
			System.out.println("Elegiste una bebida que no existe... bien!");
		} finally {
			destrabarPuertita();
		}
	}

	private void preparaBebida(int codigo) throws BebidaNoDisponibleException {
		Integer cod = new Integer(codigo);
		if (bebidas.containsKey(cod)) {
			Bebida b = (Bebida) this.bebidas.get(cod);
			System.out.println("Preparando " + b.getClass().getName());
			b.preparar(dispenser);
		} else {
			throw new BebidaNoDisponibleException();
		}
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void habilitar() {
		this.estado = new Habilitado();
	}

	public void recibirMoneda(int centavos) {
		System.out.println("Recibiendo " + centavos + " creditos");
		this.saldo = this.estado.calcularNuevoSaldo(this, centavos);
	}

	public int getVasosRestantes() {
		return vasosRestantes;
	}

	public void recargarVasos(int cantidad) {
		this.vasosRestantes = cantidad;
	}

	public int getCantidadBebidas() {
		return this.bebidas.size();
	}

}
