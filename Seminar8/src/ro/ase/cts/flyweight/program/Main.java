package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FabricaRezervari;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1,3,"12.00");
		Rezervare rezervare2 = new Rezervare(3,5,"16.00");
		
		FabricaRezervari fabrica = new FabricaRezervari();
		fabrica.getClient("george@emai.com").afisareInformatii(rezervare1);
		fabrica.getClient("george@emai.com").afisareInformatii(rezervare2);
		
		Rezervare rezervare3 = new Rezervare(2,4,"17:00");
		fabrica.getClient("email").afisareInformatii(rezervare3);
		

	}

}
