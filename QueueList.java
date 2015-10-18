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


public class QueueList<E> extends AbstractQueue<E> implements Queue<E>
{
    /**
     * The list holding queue values in order.
     */
    protected List<E> data;

    /**
     * Construct a new queue with no data.
     *
     * @post Constructs a new, empty queue
     */
    public QueueList()
    {
        data = new CircularList<E>();
    }

    /**
     * Add a value to the tail of the queue.
     *
     * @post The value is added to the tail of the structure
     * 
     * @param value The value added.
     * @see #enqueue
     */
    public void add(E value)
    {
        data.addLast(value);
    }

    /**
     * Remove a value from the head of the queue.
     *
     * @pre The queue is not empty
     * @post The head of the queue is removed and returned
     * 
     * @return The value actually removed.
     * @see #dequeue
     */
    public E remove()
    {
        return data.removeFirst();
    }

    /**
     * Fetch the value at the head of the queue.
     *
     * @pre The queue is not empty
     * @post The element at the head of the queue is returned
     * 
     * @return Reference to the first value of the queue.
     */
    public E get()
    {
        return data.getFirst();
    }

    /**
     * Determine the number of elements within the queue.
     *
     * @post Returns the number of elements in the queue
     * 
     * @return The number of elements within the queue.
     */
    public int size()
    {
        return data.size();
    }

    /**
     * Remove all the values from the queue.
     *
     * @post Removes all elements from the queue
     */
    public void clear()
    {
        data.clear();
    }

    /**
     * Determine if the queue is empty.
     *
     * @post Returns true iff the queue is empty
     * 
     * @return True iff the queue is empty.
     */
    public boolean isEmpty()
    {
        return data.isEmpty();
    }

    public Iterator<E> iterator()
    {
        return data.iterator();
    }

    /**
     * Construct a string representation of the queue.
     *
     * @post Returns string representation of queue
     * 
     * @return String representing the queue.
     */
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<QueueList:");
        Iterator li = data.iterator();
        while (li.hasNext())
        {
            s.append(" "+li.next());
        }
        s.append(">");
        return s.toString();
    }

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}
}
