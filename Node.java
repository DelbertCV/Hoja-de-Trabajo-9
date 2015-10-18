/**
  * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 * 
 * Obtenido en Internet por medio de Google Search buscando
 * "NombreDeLaClase".java seguida de "Duane Bailey".
 * 
 *  
 * Propiedad del autor Duane A. Bailey
 */

public class Node<E> {
	/**
	 * The data value stored in this node.
	 */
	protected E element; // value stored in this element

	/**
	 * Reference to the next node in the list.
	 */
	protected Node<E> next; // ref to next

	/**
	 * Construct a singly linked list element.
	 * 
	 * @pre v is a value, next is a reference to remainder of list
	 * @post an element is constructed as the new head of list
	 * @param v
	 *            The value to be referenced by this element.
	 * @param nextElt
	 *            A reference to the next value in the list.
	 */
	public Node(E v, Node<E> nextElt) {
		element = v;
		next = nextElt;
	}

	/**
	 * Constructs a singly linked list element not associated with any list.
	 * next reference is set to null.
	 * 
	 * @post constructs a new tail of a list with value v
	 * 
	 * @param v
	 *            The value to be inserted into the singly linked list element.
	 */
	public Node(E v) {
		this(v, null);
	}

	/**
	 * @post returns reference to next value in list
	 * 
	 */
	public Node<E> next() {
		return next;
	}

	/**
	 * Update the next element.
	 * 
	 * @post sets reference to new next value
	 * 
	 * @param nextElt
	 *            The new value of the next element reference.
	 */
	public void setNext(Node<E> nextElt) {
		next = nextElt;
	}

	/**
	 * Fetch the value associated with this element.
	 * 
	 * @post returns value associated with this element
	 * 
	 * @return Reference to the value stored within this element.
	 */
	public E value() {
		return element;
	}

	/**
	 * Set the value associated with this element.
	 * 
	 * @post sets value associated with this element
	 * 
	 * @param value
	 *            The new value to be associated with this element.
	 */
	public void setValue(E value) {
		element = value;
	}

	/**
	 * Construct a string representation of element.
	 * 
	 * @post returns string representation of element
	 * 
	 * @return The string representing element.
	 */
	public String toString() {
		return "<SinglyLinkedNode: " + value() + ">";
	}
}
