package edu.design;

import java.util.ArrayList;

public class Central {

	private ArrayList<Estacion> estaciones = new ArrayList<Estacion>();
	private String code;

	public Central(String code) {
		this.setCode(code);
	}

	public void add(Estacion e) {
		this.estaciones.add(e);
		e.setCentral(this);
	}

	public void remove(Estacion e) {
		this.estaciones.remove(e);
		e.setCentral(null);
	}

	public void broadcast(Event e) {
		for (Estacion est : estaciones) {
			if (!est.getCode().equals(e.getSender())) {
				est.receive(e);
			}
		}
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	
	
}
