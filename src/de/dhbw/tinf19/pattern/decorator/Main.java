package de.dhbw.tinf19.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		
		Glasfaser kernDerZwiebel = new Glasfaser();
		ISDN guteAlte = new ISDN();
		Verleetung coolness = new Verleetung(guteAlte);
		Verschlüsselung ersteSchichtDrumrum = new Verschlüsselung(coolness);
		Komprimierung zweiteSchicht = new Komprimierung(ersteSchichtDrumrum);
		Komprimierung dritteSchicht = new Komprimierung(zweiteSchicht);
		
		dritteSchicht.übertrage("Hallo, Welt");
	}
}
