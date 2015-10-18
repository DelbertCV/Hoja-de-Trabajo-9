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

public abstract class AbstractStack<E> extends AbstractLinear<E> implements Stack<E>
{
    /**
     * Add an element from the top of the stack.
     *
     * @post item is added to stack
     *       will be popped next if no intervening add
     * 
     * @param item The element to be added to the stack top.
     */
    public void push(E item)
    {
        add(item);
    }

    /**
     * Remove an element from the top of the stack.
     *
     * @pre stack is not empty
     * @post most recently added item is removed and returned
     * 
     * @return The item removed from the top of the stack.
     */
    public E pop()
    {
        return remove();
    }

    /**
     * Fetch a reference to the top element of the stack.
     * @pre stack is not empty
     * @post top value (next to be popped) is returned
     * @deprecated Please use method get, rather than getFirst!
     * @return A reference to the top element of the stack.
     */
    @Deprecated public E getFirst()
    {
        return get();
    }

    /**
     * Fetch a reference to the top element of the stack.
     * Provided for compatibility with java.util.Stack.
     * @pre stack is not empty
     * @post top value (next to be popped) is returned
     * 
     * @return A reference to the top element of the stack.
     */
    public E peek()
    {
        return get();
    }
}
