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

class SinglyLinkedListIterator<E> extends AbstractIterator<E>
{
    /**
     * The reference to currently considered element within list.
     */
    protected Node<E> current;
    /**
     * The head of list.
     */
    protected Node<E> head;

    /**
     * Construct an iterator that traverses list beginning at t.
     *
     * @post returns an iterator that traverses a linked list
     * 
     * @param t The first element of list to be traversed.
     */
    public SinglyLinkedListIterator(Node<E> t)
    {
        head = t;
        reset();
    }
    
    /**
     * Reset iterator to beginning of the structure.
     *
     * @post iterator is reset to beginning of traversal
     */
    public void reset()
    {
        current = head;
    }

    /**
     * Determine if the iteration is finished.
     *
     * @post returns true if there is more structure to be viewed:
     *       i.e., if value (next) can return a useful value.
     * 
     * @return True if the iterator has more elements to be considered.
     */
    public boolean hasNext()
    {
        return current != null;
    }

    /**
     * Return current value and increment Iterator.
     *
     * @pre traversal has more elements
     * @post returns current value and increments iterator
     * 
     * @return The current value, before increment.
     */
    public E next()
    {
        E temp = current.value();
        current = current.next();
        return temp;
    }

    /**
     * Return structure's current object reference.
     *
     * @pre traversal has more elements
     * @post returns current value referenced by iterator 
     * 
     * @return E currently referenced.
     */
    public E get()
    {
        return current.value();
    }
}
