
public class Banco {
	
	private HacelaSimpleVeraz hacelaSimple;
	
	public void solicitarCredito() {
		//tal cosa
		Cliente c = new Cliente();
		if(hacelaSimple.puedoOtorgar(c.getCuit()))
			System.out.println("OTORGADO");
		//tal otra
		
	}

}
