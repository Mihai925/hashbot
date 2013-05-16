package hashbot;

import hasher.Hash;

import java.util.Random;

public class ScoringUtils {

	public static double getScore(Hash hash) {

		double mean = 0, variance = 0;

		for (int key : hash.getHashTable()) {
			mean += key;
		}

		mean /= hash.getSize();

		for (int key : hash.getHashTable()) {
			variance += Math.pow((mean - key), 2);
		}

		variance = Math.sqrt(variance);
		return variance;

	}

	public static int[] randomArray(int size) {

		int[] array = new int[size];
		Random generator = new Random();
		for (int i = 0; i < array.length; i++)
			array[i] = generator.nextInt(Main.MAXVALUE);

		return array;

	}
}
