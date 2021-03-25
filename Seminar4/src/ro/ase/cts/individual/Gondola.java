package ro.ase.cts.individual;

public class Gondola {
	private String denumire;
	private float pret;
	private int distanta;
	
	
	private static Gondola instanta = null;


	private Gondola(String denumire, float pret, int distanta) {
		super();
		this.denumire = denumire;
		this.pret = pret;
		this.distanta = distanta;
	}


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public float getPret() {
		return pret;
	}


	public void setPret(float pret) {
		this.pret = pret;
	}


	public int getDistanta() {
		return distanta;
	}


	public void setDistanta(int distanta) {
		this.distanta = distanta;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Gondola [denumire=" + denumire + ", pret=" + pret + ", distanta=" + distanta + "]";
	}


	public static synchronized Gondola getInstance(String denumire, float pret, int distanta) {
		if(instanta == null) {
			instanta = new Gondola(denumire,pret,distanta);
		}
		return instanta;
		
	}

}
