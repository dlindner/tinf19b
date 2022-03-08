package de.dhbw.tinf19.pattern.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Das Subjekt
 */
public class Hausrufanlage {

	private final List<Gegensprechanlage> angemeldetenEndpunkte;
	
	public Hausrufanlage() {
		super();
		this.angemeldetenEndpunkte = new LinkedList<>();
	}
	
	// Convenience-Methode
	public void anmelden(
			Gegensprechanlage... endpunkte) {
		Stream.of(endpunkte).forEach(this::anmelden);
	}
	
	public void anmelden(
			Gegensprechanlage endpunkt) {
		this.angemeldetenEndpunkte.add(endpunkt);
	}

	public void abmelden(
			Gegensprechanlage endpunkt) {
		this.angemeldetenEndpunkte.remove(endpunkt);
	}
	
	public void anruf() {
		for (Gegensprechanlage each : this.angemeldetenEndpunkte) {
			Thread endpunktThread = new Thread(
					each::gesprächswunsch);
			endpunktThread.start();
		}
	}
}
