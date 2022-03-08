package de.dhbw.tinf19.pattern.observer;

public class Türtelefon implements Gegensprechanlage {
	
	public Türtelefon() {
		super();
	}
	
	@Override
	public void gesprächswunsch() {
		System.out.println("Öffne Sprachverbindung...");
	}
}
