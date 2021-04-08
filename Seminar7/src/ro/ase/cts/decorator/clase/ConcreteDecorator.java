package ro.ase.cts.decorator.clase;

public class ConcreteDecorator extends AbstractDecorator {

	public ConcreteDecorator(ICard card) {
		super(card);
		
	}

	@Override
	public void platesteContactless() {
		System.out.println(super.getCard().getDetinatorCard()+" plateste contactless.");
		
	}

	
}
