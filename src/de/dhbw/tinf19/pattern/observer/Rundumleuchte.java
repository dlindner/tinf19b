package de.dhbw.tinf19.pattern.observer;

public class Rundumleuchte implements Gegensprechanlage {
	
	public Rundumleuchte() {
		super();
	}

	@Override
	public void gesprächswunsch() {
		for (int i = 0; i < 359; i++) {
			System.out.println("Anhaltendes Licht in " + i + " Grad auf Thread " + Thread.currentThread().getId());
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
}
