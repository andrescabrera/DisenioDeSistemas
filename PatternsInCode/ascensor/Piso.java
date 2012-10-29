import java.util.Observable;
import java.util.Observer;

public class Piso implements Observer {

	private int nroDePiso;

	public Piso(int nroDePiso) {
		this.nroDePiso = nroDePiso;
	}

	public void update(Observable o, Object arg) {
		System.out.println("Visor del piso: " + this.nroDePiso + " -> el ascensor esta en el piso: "
				+ ((Ascensor) o).getPisoActual());
	}

}
