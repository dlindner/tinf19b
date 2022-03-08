package de.dhbw.tinf19.pattern.decorator;

public class Glasfaser implements Übertragungsstrecke {
	
	public Glasfaser() {
		super();
	}
	
	public void übertrage(String nachricht) {
		System.out.println("<<<" + nachricht + ">>>");
	}
}
