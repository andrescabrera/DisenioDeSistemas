package edu.patterns;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();
		context.SayWhereAmI(); /*Ezeiza*/
		
		context.IrOeste();
		context.SayWhereAmI(); 
		
		
		context.IrOeste();
		context.SayWhereAmI(); 
		
		context.IrOeste();
		context.SayWhereAmI(); 
		
		context.IrEste(); 
		context.SayWhereAmI(); 
		
		context.IrEste();
		context.SayWhereAmI(); 
		
		context.IrOeste();
		context.SayWhereAmI(); 

	}

}
