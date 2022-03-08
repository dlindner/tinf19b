package de.dhbw.tinf19.pattern.decorator;

public class ScrollDekorierer extends Dekorierer {
	
	public ScrollDekorierer(
			VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println("--- Scrolling before ---");
		super.zeichne();
		System.out.println("--- Scrolling after ---");
	}
}
