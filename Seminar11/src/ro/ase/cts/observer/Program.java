package ro.ase.cts.observer;

public class Program {

	public static void main(String[] args) {
		ClientAbonat client1 = new ClientAbonat("Popescu");
		ClientAbonat client2 = new ClientAbonat("Vasilescu");
		ClientAbonat client3 = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala(null, "Sala sportiva");
		
		sala.aboneazaClient(client3);
		sala.aboneazaClient(client2);
		sala.aboneazaClient(client1);
		sala.anuntaMeciFotbal();

	}

}
