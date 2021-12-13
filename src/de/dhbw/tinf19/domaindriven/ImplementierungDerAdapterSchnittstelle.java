package de.dhbw.tinf19.domaindriven;

public class ImplementierungDerAdapterSchnittstelle implements AdapterSchnittstelle {

	@Override
	public void wirdVererbt() {
		System.out.println("Aha!");
	}
	
	static void wirdNichtVererbt() {
		System.out.println("Echt jetzt?");
	}
}
