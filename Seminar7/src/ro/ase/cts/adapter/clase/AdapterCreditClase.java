package ro.ase.cts.adapter.clase;

public class AdapterCreditClase extends Leasing implements InterfataCredit{
	
	public AdapterCreditClase() {
		super();
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
		
	}

}
