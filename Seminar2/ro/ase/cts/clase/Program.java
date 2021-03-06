package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	
	public static List<Aplicant> citesteAplicanti(String fileName, AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti(fileName);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti("angajati.txt", new AngajatReader());
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
