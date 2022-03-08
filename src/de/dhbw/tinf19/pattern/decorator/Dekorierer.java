package de.dhbw.tinf19.pattern.decorator;

public abstract class Dekorierer implements Übertragungsstrecke {

	private final Übertragungsstrecke nachfolger;
	
	public Dekorierer(
			final Übertragungsstrecke nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	public void übertrage(String nachricht) {
		this.nachfolger.übertrage(nachricht);
	}
}
