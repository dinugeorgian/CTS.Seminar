package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.eager.ClinicaVeterinaraLazy;
import ro.ase.cts.individual.Gondola;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		
		/*
		 * ClinicaVeterinaraLazy clinica1 =
		 * ClinicaVeterinaraLazy.getInstance("ClinVet","Str. Independentei", 4,
		 * 4500.45f); ClinicaVeterinaraLazy clinica2 =
		 * ClinicaVeterinaraLazy.getInstance("VetClin","Str. Libertatii", 5, 2500.45f);
		 * 
		 * System.out.println(clinica1.toString());
		 * System.out.println(clinica2.toString());
		 * 
		 * clinica1.setNume("Clinica 1!"); clinica2.setNumarMedici(45);
		 * 
		 * System.out.println(clinica1.toString());
		 * System.out.println(clinica2.toString());
		 * 
		
		 */

		
		Gondola gondola1 = Gondola.getInstance("Sinaia", 50.5f, 200);
		Gondola gondola2 = Gondola.getInstance("Mamaia", 13.3f, 300);
		
		System.out.println(gondola1.toString());
		System.out.println(gondola2.toString());
		
		gondola1.setDistanta(500);
		
		System.out.println(gondola1.toString());
	}

}
