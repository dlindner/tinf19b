package de.dhbw.tinf19.pattern.decorator;

public class RahmenDekorierer extends Dekorierer {
	
	public RahmenDekorierer(
			VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println("*** Rahmen before ***");
		super.zeichne();
		System.out.println("*** Rahmen after ***");
	}
}
