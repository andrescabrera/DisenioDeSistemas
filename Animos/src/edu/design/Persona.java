package edu.design;

import java.util.Date;
import edu.design.states.*;;

public class Persona {

	private Estado currentState = new Normal();
	
	public String decirLaHora()
	{
		return this.currentState.decirLaHora(this);
	}
	
	public void setState(Estado s)
	{
		currentState = s;
	}
}
