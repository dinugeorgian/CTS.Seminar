package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.clase.AdapterCreditClase;
import ro.ase.cts.adapter.clase.AdapterCreditObj;
import ro.ase.cts.adapter.clase.InterfataCredit;
import ro.ase.cts.adapter.clase.Leasing;

public class Program {
	
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		//adapter obiecte
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter, "Ionel", 245.50f);
		
		//adapter clase
		AdapterCreditClase adapterCredit = new AdapterCreditClase();
		oferaInfoCredit(adapterCredit, "Gigel", 322.43f);

	}

}
