package ro.ase.cts.command;

public class Program {

	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("George"),500));
		manager.invoca(new Retragere(new ContBancar("Matei"),200));
		
		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Irina"),100));
		
		manager.executaComanda();
		manager.executaComanda();

	}

}
