package aod.lab1;

/**
 * Bara ett interface (List) som jag själv skapat
 * 
 * Ett interface som kommer brukas av LinkedList
 *
 * @author Liam Bendiksen
 * @version 2026-04-12
 */

// <T> ser till att man kan använda generics (vilken datatyp som helst)
public interface List<T> {
	
	void add(T data, int index); // Lägger till data på en specifik plats
	
	void add(T data); // Lägger till data längst bak i den länkadelistan
	
	T get(int index); // Hämtar datan på den specifika platsen
	
	void set(T data, int index); // Ändrar datan på den specifika platsen
	
	void remove(); // Tar bort datan på den platsen längst bak
	
	void remove(int index); // Tar bort datan på den specifika platsen
	
	int size(); // Ger dig antalet noder
	
	void clear(); // Tar bort allt
}
