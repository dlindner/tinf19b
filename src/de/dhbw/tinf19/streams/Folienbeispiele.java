package de.dhbw.tinf19.streams;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Folienbeispiele {

	private static final Normalo clarkKent = new Normalo();
	private static final Normalo bruceWayne = new Normalo();
	private static final Normalo peterParker = new Normalo();
	
	public static void main(String[] args) {
		Stream<Normalo> niemande = Stream.of(
				clarkKent, bruceWayne, peterParker);
			Stream<Superheld> helden =
				niemande.map(nobody -> new Superheld());
		
		System.out.println("-----------------------------------------------");
		
		Supplier<Double> zufallszahlen = new Supplier<Double>() {
			@Override
			public Double get() {
				System.out.println("-- Erstelle jetzt!");
				return Math.random();
			}
		};
		//Supplier<Double> zufallszahlen2 = Math::random;
		Stream<Double> unendlich = Stream.generate(zufallszahlen); // S
		double summe = unendlich.peek(d -> System.out.println("* " + d)) // I
				 .limit(100)							  // I
				 .filter(n -> n < 0.2)					  // I
				 .mapToDouble(Double::valueOf)
				 .sum();
				 //.forEach(System.out::println);			  // T
		System.out.println(summe);
		
		System.out.println("-----------------------------------------------");
		
		/*
		Function<String, String> rückwärts = text -> {
			StringBuilder sb=new StringBuilder(text); 
       	 	sb.reverse(); 
       	 	return sb.toString();
		};
		*/
		
		final List<String> süßigkeitenNamen = Stream.of(
				  new Süßigkeit("Weingummi", 180),
				  new Süßigkeit("Lakritzschnecken", 240),
				  new Süßigkeit("Gummibärchen", 40))
             .filter(s -> s.gewicht() > 100)
             .map(s -> s.name())
             .sorted()
             .map(name -> rückwärts(name))
             .collect(Collectors.toList());
		System.out.println(süßigkeitenNamen);
	}
	
	private static String rückwärts(String text) {
		StringBuilder sb=new StringBuilder(text); 
   	 	sb.reverse(); 
   	 	return sb.toString();
	}
	
	private static class Süßigkeit {
		
		private final String name;
		private final int gewicht;

		public Süßigkeit(String name, int gewicht) {
			super();
			this.name = name;
			this.gewicht = gewicht;
		}
		
		public int gewicht() {
			return gewicht;
		}
		
		public String name() {
			return name;
		}
	}
}
