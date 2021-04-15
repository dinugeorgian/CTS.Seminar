package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String, FlyweightAbstract> clienti;

	public FabricaRezervari(Map<String, Rezervare> clienti) {
		super();
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String email)
	{
		FlyweightAbstract client = clienti.get(email);
		if(client==null)
		{
			client = new Client("George","0728421532",email);
			clienti.put(email, client);
		}
		return client;
	}
	
	

}
