package de.dhbw.tinf19.streams.playground;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import de.dhbw.tinf19.streams.playground.book.creation.CreatePlayground;
import de.dhbw.tinf19.streams.playground.book.model.Book;
import de.dhbw.tinf19.streams.playground.book.model.Chapter;

public class YourExperiment {

	private static final Random random = new Random(132L);
	private static final int amountOfBooks = 2_000_000;

	public static void main(String[] args) throws Exception {
		final Stream<Book> allBooks = CreatePlayground.withBooks(amountOfBooks, random).stream();
		long start = System.nanoTime();

		final Stream<Book> schritt0 = allBooks.parallel();
		final Stream<Book> schritt1 = schritt0.filter(book -> book.title().length() < 25);
		final Stream<List<Chapter>> schritt2 = schritt1.map(book -> book.content());
		final Stream<Chapter> schritt3 = schritt2.flatMap(List::stream);
		final IntStream schritt4 = schritt3.mapToInt(Chapter::pages).sequential();
		System.out.println(schritt4.isParallel());
		final int seitenzahl = schritt4.sum();
		System.out.println(seitenzahl);
		
		System.out.println((System.nanoTime() - start) / 1E9);
	}
}
