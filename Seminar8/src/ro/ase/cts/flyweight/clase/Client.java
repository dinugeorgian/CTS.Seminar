package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	private String nume;
	private String nrTelefon;
	private String adresaEmail;
	
	public Client(String nume, String nrTelefon, String adresaEmail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}
	
	
	

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresaEmail=" + adresaEmail + "]";
	}




	@Override
	public void afisareInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+rezervare.toString());
		
	}
	
	

}
