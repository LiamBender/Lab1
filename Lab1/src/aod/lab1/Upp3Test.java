package aod.lab1;

import java.util.LinkedList;
import java.util.Random;

public class Upp3Test {
	public static void main(String[] args) {

		Random rand = new Random();

		int[] sizes = {20000, 40000, 80000, 160000, 320000};

		for (int n : sizes) {

			LinkedList<Integer> list = new LinkedList<>();

			for (int i = 0; i < n; i++) {
				list.add(rand.nextInt(100));
			}

			long start = System.nanoTime();

			for (int i = 0; i < list.size(); i++) {
				Integer element = list.get(i);
			}

			long timeFor = System.nanoTime() - start;

			start = System.nanoTime();

			for (Integer element : list) {
			}

			long timeForEach = System.nanoTime() - start;

			System.out.println("n = " + n);
			System.out.println("for-loop: " + timeFor);
			System.out.println("for-each: " + timeForEach);
			System.out.println();
		}
	}
}