package de.dhbw.tinf19.pattern.observer;

public class Rundumleuchte implements Gegensprechanlage {
	
	public Rundumleuchte() {
		super();
	}

	@Override
	public void gesprächswunsch() {
		System.out.println("Anhaltendes Licht");
	}
}
