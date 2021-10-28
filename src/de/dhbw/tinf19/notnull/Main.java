package de.dhbw.tinf19.notnull;

import java.util.ArrayList;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Flugzeughangar hangar = new LeererHangar();
		// Null-Referenz
		Flugzeug tanteJu = hangar.fahreRaus1("Ju-52");
		System.out.println(tanteJu);
		if (tanteJu != null) {
			tanteJu.hebeAb();
		}
		
		// Exception-Based
		try {
			Flugzeug f2 = hangar.fahreRaus2("Me-262");
			f2.hebeAb();
		} catch (KeinFlugzeugDa e) {
			System.out.println("Heute leider nicht");
		}
		
		// Optional-Based
		Optional<Flugzeug> f3 = hangar.fahreRaus3("Do-17");
		// don't do this
//		if (f3.isPresent()) {
//			f3.get().hebeAb();
//		}
		f3.ifPresent(Flugzeug::hebeAb);
		
		try {
			Optional<Flugzeug> f4 = hangar.fahreRaus4("Hindenburg");
			f4.ifPresent(Flugzeug::hebeAb);
		} catch (TechnischesProblem e) {
			System.out.println("Wegen technischer Probleme heute nicht.");
		}
	}
}
