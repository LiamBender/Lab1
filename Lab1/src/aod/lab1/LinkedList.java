package aod.lab1;

/**
 * Bara en länkadlista som jag själv har skapat
 * 
 * Själva listan som kopplar ihop noderna och implementerar interfacet
 *
 * @author Liam Bendiksen
 * @version 2026-04-12
 */

public class LinkedList<T> implements List<T> {
	
	// Instansvariabler
	private Node<T> head;
	private int size;
	
	// Konstruktor
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	// Metoder
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void clear() {
		head = null;
		size = 0;
	}
	
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<T> currentNode = head;
		
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		
		return currentNode.getElement();
	}
	
	@Override
	public void set(T data, int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<T> currentNode = head;
		
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		
		currentNode.setElement(data);
	}
	
	@Override
	public void add(T data) {
		add(data, size); // Lägger till datan på sista platsen
	}
	
	@Override 
	public void add(T data, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<T> node = new Node<>(data);
		
		if (index == 0) {
			node.setNext(head);
			head = node;
		} else {
			Node<T> currentNode = head;
			
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getNext();
			}
			
			node.setNext(currentNode.getNext());
			currentNode.setNext(node);
		}
		
		size++;
	}
	
	@Override
	public void remove() {
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		}
		remove(size - 1);
	}
	
	@Override
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0) {
			head = head.getNext();
		} else {
			Node<T> currentNode = head;
			
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getNext();
			}
			
			currentNode.setNext(currentNode.getNext().getNext());
		}
		
		size--;
	}

}
