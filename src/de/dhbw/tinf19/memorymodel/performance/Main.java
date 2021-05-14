package de.dhbw.tinf19.memorymodel.performance;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	private static final int dataSize = 32768;
	
    public static void main(final String[] arguments) {
    	final int[] data = new int[dataSize];

        final Random random = new Random(0);
        for (int i = 0; i < data.length; ++i) {
            data[i] = random.nextInt() % 256;
        }

        final long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 100_000; ++i) {
            for (int j = 0; j < data.length; ++j) {
                if (data[j] >= 128) {
                    sum += data[j];
                }
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("duration: " + (System.nanoTime() - start) / 1E9);
    }
}