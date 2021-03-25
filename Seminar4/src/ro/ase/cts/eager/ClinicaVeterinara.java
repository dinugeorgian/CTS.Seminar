package ro.ase.cts.eager;

public class ClinicaVeterinara {
	
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	// La EagerInitialization instanta este initializata la momentul declararii
	private static final ClinicaVeterinara clinica = new ClinicaVeterinara("Clinica Vet","Str. Dorobanti", 5, 3000.2f);
	
	// Constructorul obligatoriu trebuie sa fie private
	private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	// Functia statica care va returna instanta
	public static ClinicaVeterinara getInstance() {
		return clinica;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNumarMedici() {
		return numarMedici;
	}

	public void setNumarMedici(int numarMedici) {
		this.numarMedici = numarMedici;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici + ", buget="
				+ buget + "]";
	}


	
	
	
	
	
	

}
