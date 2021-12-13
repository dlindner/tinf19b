package de.dhbw.tinf19.domaindriven;

public interface AdapterSchnittstelle {

	void wirdVererbt();
	
	static void wirdNichtVererbt() {
		System.out.println("Ach so!");
	}
}
