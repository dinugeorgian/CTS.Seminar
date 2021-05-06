package ro.ase.cts.chainofresponsibility;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(2500,"George",null);
		Cont contEconomii = new ContEconomii(2900,"George",null);
		Cont contCredit = new ContCredit(3600,"George",null);
		Cont contIndisponibil = new ContIndisponibil("George");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(3000);
	}

}
