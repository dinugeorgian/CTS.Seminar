package ro.ase.cts.main;

import ro.ase.cts.Body;
import ro.ase.cts.Categorie;
import ro.ase.cts.CategorieFactory;
import ro.ase.cts.CategoriiMedicamente;
import ro.ase.cts.Durere;

public class Program {
	
	public static CategoriiMedicamente getTipCategorie() {
		
		return CategoriiMedicamente.raceala;
	}

	public static void main(String[] args) {
		
		
		
		try {
		CategorieFactory factory = new CategorieFactory();
		Categorie durere = factory.creareCategorie(CategoriiMedicamente.durere, 5);
		Categorie body = factory.creareCategorie(CategoriiMedicamente.body, 10);
		Categorie categorie = factory.creareCategorie(getTipCategorie(), 15);
		
		System.out.println(durere.toString());
		System.out.println(body.toString());
		System.out.println(categorie.toString());
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
