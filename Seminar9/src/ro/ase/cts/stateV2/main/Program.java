package ro.ase.cts.stateV2.main;

import ro.ase.cts.state.Masa;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
	//	masa.setStareMasa(new StareLibera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		
		masa.elibereazaMasa();


	}

}
