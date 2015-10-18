/**
 * 
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
 * 
 */

class CircularListIterator<E> extends AbstractIterator<E>
{
    /**
     * The tail of the traversed list.
     */
    protected Node<E> tail;
    /**
     * The current value of the iterator.
     */
    protected Node<E> current;

    /**
     * Constructs an iterator over circular list whose tail is t
     *
     * @pre t is a reference to a circular list element
     * @post constructs an iterator for traversing circular list
     * 
     * @param t The tail of the list to be traversed.
     */
    public CircularListIterator(Node<E> t)
    {
        tail = t;
        reset();
    }

    /**
     * Resets iterator to consider the head of the list.
     *
     * @post rests iterator to point to head of list
     */
    public void reset()
    {
        if (tail == null) current = null;
        else current = tail.next();
    }

    /**
     * Determine if there are unconsidered elements.
     *
     * @post returns true if some elements not visited
     * 
     * @return True iff some element has not been considered.
     */
    public boolean hasNext()
    {
        return current != null;
    }

    /**
     * Return the current value and increment iterator.
     *
     * @pre hasNext()
     * @post returns current element, increments iterator
     * 
     * @return The current value before incrementing.
     */
    public E next()
    {
        E result = current.value();
        if (current == tail) current = null;
        else current = current.next();
        return result;
    }

    /**
     * Determine the current value of iterator.
     *
     * @pre hasNext()
     * @post returns current value
     * 
     * @return The current value of the iterator.
     */
    public E get()
    {
        return current.value();
    }
}
