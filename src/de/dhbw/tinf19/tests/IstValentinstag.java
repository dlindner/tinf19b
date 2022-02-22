package de.dhbw.tinf19.tests;

import java.time.LocalDateTime;
import java.time.Month;

public class IstValentinstag {

	private Zeitgeber heuteLieferant;

	public IstValentinstag() {
		this(LocalDateTime::now);
	}
	
	public IstValentinstag(
			Zeitgeber heuteLieferant) {
		super();
		this.heuteLieferant = heuteLieferant;
	}
	
	public boolean heute() {
		return am(this.heuteLieferant.jetzt());
	}
	
	public static boolean am(
			LocalDateTime heute) {
		return ((heute.getDayOfMonth() == 14)
				&& (heute.getMonth() == Month.FEBRUARY));
	}
	
	@FunctionalInterface
	public static interface Zeitgeber {
		LocalDateTime jetzt();
	}
}
