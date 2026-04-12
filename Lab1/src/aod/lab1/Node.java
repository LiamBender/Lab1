package aod.lab1;

/**
 * Node som skall användas för den länkade listan
 * 
 * Varje node sparar ett data element och en referens till nästa node
 *
 * @author Liam Bendiksen
 * @version 2026-04-12
 */

// <NT> ser till att man kan lagra vilken datatyp som helst
public class Node<NT> {
	
	// Instansvariabler
	private NT element;
	private Node<NT> next;
	
	// Konstruktor
	public Node(NT element) {
		this.element = element;
		this.next = null;
	}
	
	// Getter
	public NT getElement() {
		return element;
	}
	
	public Node<NT> getNext() {
		return next;
	}
	
	// Setter
	public void setElement(NT element) {
		this.element = element;
	}
	
	public void setNext(Node<NT> next) {
		this.next = next;
	}
	
	

}
