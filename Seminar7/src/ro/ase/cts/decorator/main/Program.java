package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.AbstractDecorator;
import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.ConcreteDecorator;
import ro.ase.cts.decorator.clase.ICard;

public class Program {

	public static void main(String[] args) {
		
		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new ConcreteDecorator(card);
		decorator.platesteContactless();

	}

}
