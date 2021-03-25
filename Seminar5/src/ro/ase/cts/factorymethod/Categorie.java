package ro.ase.cts.factorymethod;

public abstract class Categorie {
	
	 float pretDeBaza;

	protected Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}

	@Override
	public String toString() {
		return "Categorie [pretDeBaza=" + pretDeBaza + "]";
	}
	 
	 
	 
}
