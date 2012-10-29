package edu.design.states;

import java.util.Date;

import edu.design.Persona;

public class Normal implements Estado {

	private Date ultimaVezQuePregunto = null;
	private int vecesQuePregunto = 1;
	
	public String decirLaHora(Persona context)
	{
		Date ahora = new Date();
		if (this.ultimaVezQuePregunto != null)
		{
			if (ahora.getTime() - ultimaVezQuePregunto.getTime() <= 5000)
			{
				this.vecesQuePregunto++;
				if (this.vecesQuePregunto == 3)
				{
					context.setState(new Podrido());
				}
			}
			else
			{
				this.ultimaVezQuePregunto = new Date();
				this.vecesQuePregunto = 1;
			}
		}
		else
		{
			this.ultimaVezQuePregunto = new Date();
		}
		return "Son las " + (new Date()).toString() + "(" + this.vecesQuePregunto +")";
	}

}
