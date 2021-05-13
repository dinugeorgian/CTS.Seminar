package ro.ase.cts.observer;

public class ClientAbonat implements Observer {

	private String nume;
	
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println();
		
	}

}
