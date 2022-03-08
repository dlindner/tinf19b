package de.dhbw.tinf19.pattern.observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Hausrufanlage subjekt = new Hausrufanlage();
		
		MechanischeKlingel beobachter1 = new MechanischeKlingel();
		Türtelefon beobachter2 = new Türtelefon();
		Türtelefon beobachter3 = new Türtelefon();
		Rundumleuchte beobachter4 = new Rundumleuchte();
		
		subjekt.anmelden(
			beobachter1,
			beobachter2,
			beobachter3,
			beobachter4
		);
				
		Thread.sleep(1000L);
		
		subjekt.anruf();
	}
}
