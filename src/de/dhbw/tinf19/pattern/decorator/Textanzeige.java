package de.dhbw.tinf19.pattern.decorator;

public class Textanzeige implements VisuelleKomponente {
	
	public Textanzeige() {
		super();
	}
	
	public void zeichne() {
		System.out.println("Text");
	}
}
