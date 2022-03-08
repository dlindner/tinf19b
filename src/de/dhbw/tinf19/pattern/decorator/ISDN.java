package de.dhbw.tinf19.pattern.decorator;

public class ISDN implements Übertragungsstrecke {
	
	public ISDN() {
		super();
	}
	
	@Override
	public void übertrage(String nachricht) {
		char[] charArray = nachricht.toCharArray();
		for (char c : charArray) {
			System.out.print(c);
			try {
				Thread.sleep(250L);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println();
	}

}
