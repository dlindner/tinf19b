package de.dhbw.tinf19.pattern.observer;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Hausrufanlage subjekt = new Hausrufanlage();
		
		MechanischeKlingel beobachter1 = new MechanischeKlingel();
		Türtelefon beobachter2 = new Türtelefon();
		Türtelefon beobachter3 = new Türtelefon();
		Rundumleuchte beobachter4 = new Rundumleuchte();
		
		subjekt.anmelden(
			beobachter4,
			beobachter1,
			beobachter2,
			beobachter3
		);
				
		Thread.sleep(1000L);
		
		Thread klingler = new Thread(() -> {
				System.out.println("Der Thread " + Thread.currentThread().getId() + " mit Namen " + Thread.currentThread().getName() + " klingelt ...");
				for (int i = 0; i < 10_000; i++) {
					subjekt.anruf();
				}
			},
			"der klingler");
		klingler.start();
		
		System.out.println("main endet");
	}
}
