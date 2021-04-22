package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.Card;
import ro.ase.cts.strategy.Cash;
import ro.ase.cts.strategy.Client;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Popescu");
		client.setModPlata(new Cash());
		
		client.platesteNota(200.00);
		
		client.setModPlata(new Card(500.00));
		client.platesteNota(350.00);
		
		

	}

}
