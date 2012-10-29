package edu.design;

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			Persona p = new Persona();
			String mensaje = null;
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);

			Thread.sleep(8000);

			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			mensaje = p.decirLaHora();
			System.out.println(mensaje);
			

		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
