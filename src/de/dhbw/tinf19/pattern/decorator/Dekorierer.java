package de.dhbw.tinf19.pattern.decorator;

public abstract class Dekorierer implements VisuelleKomponente {

	private final VisuelleKomponente nachfolger;
	
	public Dekorierer(
			final VisuelleKomponente nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	public void zeichne() {
		System.out.println("! Durchlaufen hinweg!");
		this.nachfolger.zeichne();
		System.out.println("! Durchlaufen rückweg!");
	}
}
