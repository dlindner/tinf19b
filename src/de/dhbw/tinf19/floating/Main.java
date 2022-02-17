package de.dhbw.tinf19.floating;

public class Main {

	public static void main(String[] args) {
		double zahl = 218;
		
		System.out.println(zahl / 0.0D);
		System.out.println(zahl / -0.0D);
		System.out.println((zahl / 0.0D) + 1);
		
		double notANumber = (zahl / 0.0D) / Double.POSITIVE_INFINITY;
		System.out.println(Double.NaN == notANumber);
		System.out.println(Double.isNaN(notANumber));
		
		double tödlich = Double.MAX_VALUE - 1;
		System.out.println(tödlich);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_VALUE + 1);
		System.out.println(Double.MAX_VALUE + Double.MAX_VALUE);
	}
}
