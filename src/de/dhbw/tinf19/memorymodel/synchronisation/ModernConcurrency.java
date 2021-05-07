package de.dhbw.tinf19.memorymodel.synchronisation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ModernConcurrency {

	public static void main(String[] args) {
		Random random = new Random();
		Stream<Integer> data = Stream
				.generate(() -> random.nextInt())
				.map(i -> i % 256)
				.limit((int) 1E7);
//		List<Integer> data = new ArrayList<>();
//		for (int i = 0; i < 1E9; i++) {
//			data.add(random.nextInt() % 256);
//		}
		
		System.out.println("start");
		
        final long start = System.nanoTime();
		int summe = data
			.filter(i -> i >= 128)
			.mapToInt(Integer::intValue)
			.sum();
		
        System.out.println("sum: " + summe);
        System.out.println("duration: " + (System.nanoTime() - start) / 1E9);
	}
}
