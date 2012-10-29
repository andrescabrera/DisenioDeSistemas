import java.util.Observable;


public class Ascensor extends Observable {

	private Integer pisoActual = 0;

	public Integer getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(Integer pisoActual) {
		this.pisoActual = pisoActual;
		setChanged();
		notifyObservers();
	}
	
	
}
