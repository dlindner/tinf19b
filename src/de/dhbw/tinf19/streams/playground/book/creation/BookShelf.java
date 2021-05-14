package de.dhbw.tinf19.streams.playground.book.creation;

import java.util.Random;
import java.util.stream.Stream;

import de.dhbw.tinf19.streams.playground.book.model.Book;

public class BookShelf {

	public static Stream<Book> asStream(
			final Random random) {
		return Stream.generate(() -> Book.createWith(random));
	}
}
