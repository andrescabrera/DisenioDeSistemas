package edu.design;

import java.util.ArrayList;

public class Estacion implements SensorListener {
	private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	private String code;
	private Central central = null;

	public Estacion(String code) {
		this.code = code;
	}

	public void add(Sensor s) {
		sensores.add(s);
		s.add(this);
	}

	public void remove(Sensor s) {
		sensores.remove(s);
		s.remove(this);
	}

	@Override
	public void receive(Sample sample, Sensor sender) {
		System.out.println("soy " + this.code + " y recibi una muestra de "
				+ sender.getName() + " con valor " + sample.getValue());
		if (sample.getValue() > 500000) {
			this.central.broadcast(new Event(this.code, "WARN",
					"VAMOR A MORIR!!"));
		}
	}

	public void setCentral(Central central) {
		this.central = central;
	}

	public Central getCentral() {
		return central;
	}

	public void receive(Event e) {
		System.out.println("soy " + this.code + " y me informan que la estacion " + e.getSender() + " dice que "
				+ e.getMessage());
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
