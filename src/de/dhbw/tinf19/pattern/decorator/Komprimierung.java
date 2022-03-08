package de.dhbw.tinf19.pattern.decorator;

public class Komprimierung extends Dekorierer {
	
	public Komprimierung(
			Übertragungsstrecke nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void übertrage(String nachricht) {
		super.übertrage(
				komprimiere(
						nachricht));
	}
	
	private String komprimiere(String text) {
		StringBuilder result = new StringBuilder();
		boolean include = true;
		for (char each : text.toCharArray()) {
			if (include) {
				result.append(each);
			}
			include = !include;
		}
		return result.toString();
	}
}
