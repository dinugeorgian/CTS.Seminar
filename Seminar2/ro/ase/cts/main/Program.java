package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(String fileName, AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti(fileName);
	}

	public static void main(String[] args) {
		
		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		
		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			Proiect proiect = new Proiect(80);
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				Angajat.afiseazaStatus(proiect);
				System.out.println(angajat.getSumaFinantata());
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
