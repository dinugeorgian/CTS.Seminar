package ro.ase.cts.facade;

public class Pacient {
	
	private boolean esteInStareGrava;
	private String nume;
	
	
	public Pacient(boolean esteInStareGrava, String nume) {
		super();
		this.esteInStareGrava = esteInStareGrava;
		this.nume = nume;
	}


	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}


	public String getNume() {
		return nume;
	}


	@Override
	public String toString() {
		return "Pacient [esteInStareGrava=" + esteInStareGrava + ", nume=" + nume + "]";
	}
	
	
	
	

}
