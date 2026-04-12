package aod.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	public void addMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		
		assertEquals(1, list.size());
		assertEquals(10, list.get(0));
	}
	
	@Test
	public void addMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		assertEquals(3, list.size());
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(1));
		assertEquals(30, list.get(2));
	}
	
	@Test
	public void addMethodTestThree() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10, 0);
		list.add(5, 1);
		list.add(57, 2);
		
		assertEquals(3, list.size());
		assertEquals(10, list.get(0));
		assertEquals(5, list.get(1));
		assertEquals(57, list.get(2));
	}
	
	@Test
	public void addMethodTestFour() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1, 0);
		list.add(2, 1);
		list.add(3, 2);
		list.add(4, 3);
		list.add(5, 4);
		list.add(6, 5);
		
		assertEquals(6, list.size());
		
		for (int i = 0; i < list.size(); i++) {
			assertEquals(i + 1, list.get(i));
		}
	}
	
	@Test
	public void getMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 3; i++) {
			list.add(i);
		}
		
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
	}
	
	@Test
	public void getMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i <= 6; i++) {
			list.add(i);
		}
		
		for (int i = 1; i < list.size(); i++) {
			assertEquals(i, list.get(i - 1));
		}
	}
	
	@Test
	public void invalidIndexTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
	}
	
	@Test
	public void setMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(100);
		
		list.set(99, 0);
		
		assertEquals(99, list.get(0));
		assertEquals(100, list.get(1));
	}
	
	@Test
	public void setMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(100);
		list.add(100);
		list.add(100);
		
		list.set(99, 0);
		list.set(5932, 3);
		list.set(593200, 2);
		
		assertEquals(99, list.get(0));
		assertEquals(100, list.get(1));
		assertEquals(593200, list.get(2));
		assertEquals(5932, list.get(3));
	}
	
	@Test
	public void removeMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.remove();

		assertEquals(2, list.size());
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(1));
	}
	
	@Test
	public void removeMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.remove();
		list.remove();

		assertEquals(1, list.size());
		assertEquals(10, list.get(0));
	}
	
	@Test
	public void removeMethodTestThree() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.remove(0);
		list.remove(1);

		assertEquals(1, list.size());
		assertEquals(20, list.get(0));
	}
	
	@Test
	public void removeMethodTestFour() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.remove(1);

		assertEquals(2, list.size());
		assertEquals(10, list.get(0));
		assertEquals(30, list.get(1));
	}
	
	@Test
	public void removeMethodTestEmptyList() {
		LinkedList<Integer> list = new LinkedList<>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove());
	}
	
	@Test
	public void sizeMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		
		assertEquals(0, list.size());
	}
	
	@Test
	public void sizeMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.remove();
		list.add(24839);
		
		assertEquals(2, list.size());
	}
	
	@Test
	public void clearMethodTestOne() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		list.clear();

		assertEquals(0, list.size());
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
	}
	
	@Test
	public void clearMethodTestTwo() {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.clear();
		
		assertEquals(0, list.size());
	}
	
	@Test
	public void clearMethodTestThree() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		list.clear();
		
		assertEquals(0, list.size());
	}
	
	
	
	

}
