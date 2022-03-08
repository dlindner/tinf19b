package de.dhbw.tinf19.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		
		Textanzeige kernDerZwiebel = new Textanzeige();
		ScrollDekorierer ersteSchichtDrumrum = new ScrollDekorierer(kernDerZwiebel);
		RahmenDekorierer zweiteSchicht = new RahmenDekorierer(ersteSchichtDrumrum);
		
		zweiteSchicht.zeichne();
	}
}
