package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.IRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;
import ro.ase.cts.proxy.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		IRezervare rezervarePentruDouaPersoane = new Rezervare(3,2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy= new ProxyRezervare((Rezervare) rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();

	}

}
