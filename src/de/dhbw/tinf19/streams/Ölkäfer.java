package de.dhbw.tinf19.streams;

public class Ölkäfer {

	private final String name;
	
	public Ölkäfer(String name) {
		super();
		this.name = name;
	}
	
	public /* static */ void ärgere(/*Ölkäfer this*/) {
		System.out.println(this.name + " sondert Öl ab (instanz)");
	}
	
	public static void ärgere2(Ölkäfer self) {
		System.out.println(self.name + " sondert Öl ab (klasse)");
	}
	
	public boolean istGiftig() {
		return true;
	}
	
	public boolean istGiftigMit(Gras gras) {
		return false;
	}

	public boolean istGiftigMit(Fliegenpilz pilz) {
		return true;
	}

	public boolean istGiftigMit(Gras gras, Fliegenpilz pilz) {
		return istGiftigMit(pilz);
	}
	
	public Gift produziereGiftAus(/*Ölkäfer this, */Gras gras, Fliegenpilz pilz) {
		return new Gift();
	}
	
	public /* static */ Käferei produziereAus(/*Ölkäfer this, */ Gras gras) {
		return new Käferei();
	}
	
	public static Käferei produziereAus(Gras gras, Ölkäfer käfer) {
		return new Käferei();
	}
	
	public String getName() {
		return name;
	}
}
