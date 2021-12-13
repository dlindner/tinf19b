package de.dhbw.tinf19.domaindriven;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Preis teuer = new Preis(100);
		Preis billig = new Preis(90);
		
		System.out.println(
				teuer.equals(billig));
		System.out.println(
				teuer.equals(teuer));
		
		Preis auchteuer = new Preis(100);
		
		System.out.println(
				teuer.equals(auchteuer));
		
		Set<Preis> verwendetePreise = new HashSet<>();
		verwendetePreise.add(teuer);
		verwendetePreise.add(billig);
		verwendetePreise.add(auchteuer);
		
		System.out.println(verwendetePreise.size());
	}
}
