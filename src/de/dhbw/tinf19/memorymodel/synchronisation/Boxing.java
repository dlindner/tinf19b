package de.dhbw.tinf19.memorymodel.synchronisation;

public class Boxing {

	public static void main(String[] args) {
		Integer wert2 = Integer.valueOf(128);
		Integer wert3 = Integer.valueOf(128);
		
		System.out.println(wert2 == wert3);
		System.out.println(wert2.equals(wert3));
	}
}
