package ro.ase.cts.readere;

import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader {
	
	private String fileName;
	
	public abstract List<Aplicant> citesteAplicanti(String file) throws FileNotFoundException, NumberFormatException;
	
	

}
