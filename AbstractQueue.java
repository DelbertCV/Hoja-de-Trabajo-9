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
public abstract class AbstractQueue<E>
    extends AbstractLinear<E> implements Queue<E>
{
    /**
     * Add a value to the tail of the queue.
     *
     * @post the value is added to the tail of the structure
     * 
     * @param value The value added.
     */
    public void enqueue(E item)
    {
        add(item);
    }

    /**
     * Remove a value form the head of the queue.
     *
     * @pre the queue is not empty
     * @post the head of the queue is removed and returned
     * 
     * @return The value actually removed.
     */
    public E dequeue()
    {
        return remove();
    }

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre the queue is not empty
     * @post the element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E getFirst()
    {
        return get();
    }

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre the queue is not empty
     * @post the element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E peek()
    {
        return get();
    }
}
