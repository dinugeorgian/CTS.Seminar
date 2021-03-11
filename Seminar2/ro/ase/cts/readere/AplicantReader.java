package ro.ase.cts.readere;

import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader {
	
	private String fileName;
	
	public AplicantReader(String filename) {
		super();
		this.filename = filename;
	}
	
	public String getFilename() {
		return filename;
	}
	
	
	public abstract List<Aplicant> citesteAplicanti(String file) throws FileNotFoundException, NumberFormatException;
	
	public void citesteAplicant(Scanner input) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setNr_proiecte(nr,vect);
		
		
		
		
	}
	

}
