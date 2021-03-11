import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

	public List<Aplicant> citesteAplicanti(String file) throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student = new Student();
			super.citesteAplicant(input,student);
			student.setAn_studii(input.nextInt());
			student.setFacultate(input.next().toChar());
			
			studenti.add(student);
		}
		input.close();
		return studenti;
	}
}
