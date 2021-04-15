package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.IOptiuniMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		
		IOptiuniMeniu meniu = new Sectiune("Meniu restaurant");
		
		IOptiuniMeniu optiune1 = new Sectiune("Bauturi");
		IOptiuniMeniu optiune2 = new Sectiune("Desert");
		
		IOptiuniMeniu item1 = new Item("Apa minerala");
		IOptiuniMeniu item2 = new Item("Frappe");
		IOptiuniMeniu item3 = new Item("Papanasi");
		
		try {
		optiune1.adaugaNod(item1);
		optiune1.adaugaNod(item2);
		optiune2.adaugaNod(item3);
		
		meniu.adaugaNod(optiune1);
		meniu.adaugaNod(optiune2);
		
	
		meniu.descriere();
		
		optiune1.stergeNod(item1);
		optiune2.adaugaNod(item1);
		
		meniu.descriere();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
