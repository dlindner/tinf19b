package de.dhbw.tinf19.principles;

import java.util.Arrays;
import java.util.List;

public class Kovarianz {

	public static void main(String[] args) {
		final Integer[] fibonacci = new Integer[] {
		    1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
		};
		final Double pi = Double.valueOf(3.141592653589793238463D);

		final Number[] numbers = fibonacci;
		final Number someNumber = pi;

		numbers[0] = pi;

		numbers[1] = someNumber;
		
		List<Object> dinge = null;
		List<? super String> texte = Arrays.asList("eins", "zwei", "drei");
		
		texte = dinge;
	}
}
