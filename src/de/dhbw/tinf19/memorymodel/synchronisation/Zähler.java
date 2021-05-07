package de.dhbw.tinf19.memorymodel.synchronisation;

public class Zähler {
	
	private final Object meinMutex = new Object();
	private final String name;
	private int stand;
	
	public Zähler(String name) {
		this.name = name;
		this.stand = 0;
	}

	public void erhöhe() {
		int zwischenstand;
		//final Object meinMutex = new Object();
		synchronized (meinMutex) {
			zwischenstand = this.stand + 1;
			this.stand = zwischenstand;
		}
	}
	
	@Override
	public String toString() {
		return "Zähler [name=" + name + ", stand=" + stand + "]";
	}
}
