package de.dhbw.tinf19.pattern.decorator;

public class Verleetung extends Dekorierer {
	
	public Verleetung(
			Übertragungsstrecke nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void übertrage(String nachricht) {
		super.übertrage(
				leete(
					nachricht));
	}
	
	private String leete(String text) {
		return "XxX° " + text + " °XxX";
	}
}
