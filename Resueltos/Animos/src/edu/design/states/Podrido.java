package edu.design.states;

import java.util.Date;
import edu.design.Persona;

public class Podrido implements Estado {

	private Date ultimaVezQuePregunto = null;
	
	public String decirLaHora(Persona context)
	{
		Date ahora = new Date();
		if (this.ultimaVezQuePregunto != null)
		{
			if (ahora.getTime() - ultimaVezQuePregunto.getTime() > 7000)
			{
				context.setState(new Normal());
				return context.decirLaHora();
			}
			else
			{
				this.ultimaVezQuePregunto = new Date();
			}
		}
		else
		{
			this.ultimaVezQuePregunto = new Date();
		}
		return "Me tenes podrido!!!!";
	}

}
