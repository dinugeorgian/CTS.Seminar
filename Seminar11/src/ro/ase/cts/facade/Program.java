package ro.ase.cts.facade;

public class Program {

	public static void main(String[] args) {
		Pacient p1 = new Pacient(false,"Dani");
		Pacient p2 = new Pacient(true,"Catalin");
		
		System.out.println(FacadeInternare.verificaPacient(p1));
		System.out.println(FacadeInternare.verificaPacient(p2));
		
	}

}
