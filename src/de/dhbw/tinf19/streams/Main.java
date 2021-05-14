package de.dhbw.tinf19.streams;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Ölkäfer maiwurm = new Ölkäfer("würmli");
		maiwurm.ärgere();
		
		// Function<Ölkäfer, void>
		Consumer<Ölkäfer> c1 = (Ölkäfer käfer) -> käfer.ärgere();
		Consumer<Ölkäfer> c2 = käfer -> käfer.ärgere();
		Consumer<Ölkäfer> c3 = Ölkäfer::ärgere;
		
		// Function<void, T>
		//Supplier<T>
		
		Function<Ölkäfer, String> benennung = Ölkäfer::getName;
		
		// Function<T, boolean>
		//Predicate<T>
		
		BiFunction<Ölkäfer, Gras, Käferei> fortpflanzung = Ölkäfer::produziereAus;
		
		TriFunction<Ölkäfer, Gras, Fliegenpilz, Gift> schwiegermutter = Ölkäfer::produziereGiftAus;
		Gift gift = schwiegermutter.apply(maiwurm, new Gras(), new Fliegenpilz());
		
		BiPredicate<Ölkäfer, Gras> ohnePilze = Ölkäfer::istGiftigMit;
		Predicate<Ölkäfer> giftig = Ölkäfer::istGiftig;
		
		//BiPredicate<Ölkäfer, Gras> ohnePilze2 = maiwurm::istGiftigMit;
		
		maiwurm.ärgere();
		//Ölkäfer.ärgere(maiwurm);
		
		//Consumer<Ölkäfer> c4 = Ölkäfer::ärgere;
	}
	
	@FunctionalInterface
	public static interface TriFunction<Eingabe1, Eingabe2, Eingabe3, Resultat> {
		Resultat apply(Eingabe1 a, Eingabe2 b, Eingabe3 c);
	}
}
