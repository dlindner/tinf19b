package de.dhbw.tinf19.pattern.observer;

import java.util.ArrayList;
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
		List<Thread> aktionen = new ArrayList<>();
		for (Gegensprechanlage each : this.angemeldetenEndpunkte) {
			Thread endpunktThread = new Thread(
					() -> {
						try {
							each.gesprächswunsch();
						} catch (Throwable e) {
							// Was hier tun?
						}
					});
			aktionen.add(endpunktThread);
			endpunktThread.start();
		}
		for (Thread each : aktionen) {
			try {
				each.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
