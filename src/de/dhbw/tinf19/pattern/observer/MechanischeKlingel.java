package de.dhbw.tinf19.pattern.observer;

/**
 * Ein konkreter Beobachter
 */
public class MechanischeKlingel implements Gegensprechanlage {

	public MechanischeKlingel() {
		super();
	} 
	
	@Override
	public void gesprächswunsch() {
		System.out.println("Bing Bong");
	}
}
