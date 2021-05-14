package de.dhbw.tinf19.memorymodel.synchronisation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] args) throws InterruptedException {
		final Zähler a = new Zähler("a");
		final Zähler b = new Zähler("b");
		
		List<Thread> alleThreads = new ArrayList<>();
		for (int t = 0; t < 2; t++) {
			final Thread thread = new Thread(() -> {
				for (int i = 0; i < 1E5; i++) {
					a.erhöhe();
					b.erhöhe();
				}
			});
			alleThreads.add(thread);
		}

		alleThreads.forEach(Thread::start);
		for (Thread each : alleThreads) {
			each.join();
		}
		
		System.out.println(a);
		System.out.println(b);
	}
}
