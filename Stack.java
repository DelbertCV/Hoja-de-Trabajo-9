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

public interface Stack<E> extends Linear<E>
{
    /**
     * Add an element from the top of the stack.
     *
     * @post item is added to stack
     *       will be popped next if no intervening add
     * 
     * @param item The element to be added to the stack top.
     * @see #push
     */
    public void add(E item);

    /**
     * Add an element to top of stack.
     *
     * @post item is added to stack
     *       will be popped next if no intervening push
     * 
     * @param item The value to be added to the top of the stack.
     */
    public void push(E item);

    /**
     * Remove an element from the top of the stack.
     *
     * @pre stack is not empty
     * @post most recently added item is removed and returned
     * 
     * @return The item removed from the top of the stack.
     * @see #pop
     */
    public E remove();

    /**
     * Remove an element from the top of the stack.
     *
     * @pre stack is not empty
     * @post most recently pushed item is removed and returned
     * 
     * @return A reference to the removed element.
     */
    public E pop();

    /**
     * Fetch a reference to the top element of the stack.
     *
     * @pre stack is not empty
     * @post top value (next to be popped) is returned
     * 
     * @return A reference to the top element of the stack.
     */
    public E get();

    /**
     * Fetch a reference to the top element of the stack.
     *
     * @pre stack is not empty
     * @post top value (next to be popped) is returned
     * 
     * @return A reference to the top element of the stack.
     */
    public E getFirst();

    /**
     * Fetch a reference to the top element of the stack.
     *
     * @pre stack is not empty
     * @post top value (next to be popped) is returned
     * 
     * @return A reference to the top element of the stack.
     */
    public E peek();

    /**
     * Returns true iff the stack is empty.  Provided for
     * compatibility with java.util.Vector.empty.
     *
     * @post returns true if and only if the stack is empty
     * 
     * @return True iff the stack is empty.
     */
    public boolean empty();

    /**
     * Returns the number of elements in the stack.
     *
     * @post returns the number of elements in the stack
     * @return number of elements in stack.
     */
    public int size();
}
