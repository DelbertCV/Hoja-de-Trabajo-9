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


import java.util.Collection;
import java.util.Iterator;

public class StackList<E> extends AbstractStack<E> implements Stack<E>
{
    /**
     * The list that maintains the stack data.
     */
    protected List<E> data;

    /**
     * Construct an empty stack.
     *
     * @post constructs a new stack, based on lists
     */
    public StackList()
    {
        // Think about why we use singly linked lists here:
        // They're simple, and take less space.
        data = new SinglyLinkedList<E>();
    }
    
    /**
     * Remove all elements from the stack.
     *
     * @post removes all elements from stack
     */
    public void clear()
    {
        data.clear();
    }

    /**
     * Determine if the stack is empty.
     * Provided for compatibility with java.util.Stack.empty.
     *
     * @post returns true iff the stack is empty
     * 
     * @return True iff the stack is empty.
     * @see #isEmpty
     */
    public boolean empty()
    {
        return data.isEmpty();
    }

    public Iterator<E> iterator()
    {
        return data.iterator();
    }


    /**
     * Get a reference to the top value in the stack.
     *
     * @pre stack is not empty
     * @post returns the top element (most recently pushed) from stack
     * 
     * @return A reference to the top element of the top of the stack.
     */
    public E get()
    {
        return data.getFirst();
    }

    /**
     * Add a value to the top of the stack.
     *
     * @post adds an element to stack;
     *       will be next element popped if no intervening push
     * 
     * @param item The value to be added.
     * @see #push
     */
    public void add(E value)
    {
        data.addFirst(value);
    }

    /**
     * Remove a value from the top of the stack.
     *
     * @pre stack is not empty
     * @post removes and returns the top element from stack
     * 
     * @return The value removed from the top of the stack.
     * @see #pop
     */
    public E remove()
    {
        return data.removeFirst();
    }

    /**
     * Determine the number of elements in the stack.
     *
     * @post returns the size of the stack
     * 
     * @return The number of values within the stack.
     */
    public int size()
    {
        return data.size();
    }

    /**
     * Construct a string representation of the stack.
     *
     * @post returns a string representation of stack
     * 
     * @return A string representing the stack.
     */
    public String toString()
    {
        return "<StackList: "+data+">";
    }

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
}
