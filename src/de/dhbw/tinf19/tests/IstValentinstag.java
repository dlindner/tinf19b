package de.dhbw.tinf19.tests;

import java.time.LocalDateTime;
import java.time.Month;

public final class IstValentinstag {

	private IstValentinstag() {
		super();
	}
	
	public static boolean am(
			LocalDateTime heute) {
		return ((heute.getDayOfMonth() == 14)
				&& (heute.getMonth() == Month.FEBRUARY));
	}
}
