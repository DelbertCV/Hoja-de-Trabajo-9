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

public interface Queue<E> extends Linear<E>
{
    /**
     * Add a value to the tail of the queue.
     *
     * @post the value is added to the tail of the structure
     * 
     * @param value The value added.
     * @see #enqueue
     */
    public void add(E value);

    /**
     * Add a value to the tail of the queue.
     *
     * @post the value is added to the tail of the structure
     * 
     * @param value The value to be added.
     */
    public void enqueue(E value);

    /**
     * Remove a value form the head of the queue.
     *
     * @pre the queue is not empty
     * @post the head of the queue is removed and returned
     * 
     * @return The value actually removed.
     * @see #dequeue
     */
    public E remove();

    /**
     * Remove a value from the head of the queue.
     *
     * @pre the queue is not empty
     * @post the head of the queue is removed and returned
     * 
     * @return The value removed from the queue.
     */
    public E dequeue();

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre the queue is not empty
     * @post the element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E getFirst();

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre the queue is not empty
     * @post the element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E get();

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre the queue is not empty
     * @post the element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E peek();

    /**
     * Returns true iff the queue is empty.  Provided for
     * compatibility with java.util.Vector.empty.
     *
     * @post returns true if and only if the queue is empty
     * 
     * @return True iff the queue is empty.
     */
    public boolean empty();

    /**
     * Returns the number of elements in the queue.
     *
     * @post returns the number of elements in the queue
     * @return number of elements in queue.
     */
    public int size();
}
