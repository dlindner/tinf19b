package de.dhbw.tinf19.intro;

public class Flughafenparkplatz {

	public Flughafenparkplatz() {
		super();
	}
	
	public void parke(Auto auto) {
		System.out.println("F1: Das Auto ist immer noch da");
	}
	
	public void parke(Tesla tesla) {
		System.out.println("F2: Der Tesla ist zum Aufladen nach Hause gefahren");
	}
	
	public void parke(Mustang mustang) {
		System.out.println("F3: Der Mustang steht noch da, hat aber ein paar Kilometer mehr auf dem Tacho");
	}
}
