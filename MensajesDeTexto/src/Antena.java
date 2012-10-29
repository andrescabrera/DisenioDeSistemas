import java.util.ArrayList;
import java.util.List;


public class Antena {
	List<Celular> celulares = new ArrayList<Celular>();
	
	public void agregarCelular(Celular c) {
		celulares.add(c);
	}
	
	public void removerCelular(Celular c) {
		celulares.remove(c);
	}
	
	public Celular consultarPorCelular(int numero) {
		for(Celular c : celulares) {
			if(c.getNumero() == numero)
				return c;
		}
		return null;
	}
	
}
