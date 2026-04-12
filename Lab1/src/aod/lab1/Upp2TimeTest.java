package aod.lab1;

import java.util.ArrayList;
import java.util.Random;

public class Upp2TimeTest {
	public static void main(String[] args) {

		Random rand = new Random();

		int[] sizes = {20000, 40000, 80000, 160000, 320000, 640000};

		for (int n : sizes) {

			LinkedList<Integer> linkedList = new LinkedList<>();
			ArrayList<Integer> arrayList = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				int slumpTal = rand.nextInt(100);
				linkedList.add(slumpTal);
				arrayList.add(slumpTal);
			}

			// LinkedList

			// först
			long startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				linkedList.add(rand.nextInt(100), 0);
			}
			long llFirst = System.nanoTime() - startTime;

			// mitten
			startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				linkedList.add(rand.nextInt(100), linkedList.size() / 2);
			}
			long llMiddle = System.nanoTime() - startTime;

			// sist
			startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				linkedList.add(rand.nextInt(100));
			}
			long llLast = System.nanoTime() - startTime;

			// ArrayList

			// först
			startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				arrayList.add(0, rand.nextInt(100));
			}
			long alFirst = System.nanoTime() - startTime;

			// mitten
			startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				arrayList.add(arrayList.size() / 2, rand.nextInt(100));
			}
			long alMiddle = System.nanoTime() - startTime;

			// sist
			startTime = System.nanoTime();
			for (int i = 0; i < 100; i++) {
				arrayList.add(rand.nextInt(100));
			}
			long alLast = System.nanoTime() - startTime;


			System.out.println("n = " + n);

			System.out.println("LinkedList först: " + llFirst);
			System.out.println("LinkedList mitten: " + llMiddle);
			System.out.println("LinkedList sist: " + llLast);

			System.out.println("ArrayList först: " + alFirst);
			System.out.println("ArrayList mitten: " + alMiddle);
			System.out.println("ArrayList sist: " + alLast);

			System.out.println();
		}
	}
}