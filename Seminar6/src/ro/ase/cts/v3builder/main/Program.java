package ro.ase.cts.v3builder.main;

import ro.ase.cts.v3builder.Rezervare;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare = Rezervare.builder().setBauturaRacoritoare(true).setMuzicaAmbientala(true).build();
		System.out.println(rezervare);

	}

}
