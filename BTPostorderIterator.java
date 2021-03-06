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
class BTPostorderIterator<E> extends AbstractIterator<E>
{
    /**
     * The root of the tree currently being traversed.
     */
    protected BinaryTree<E> root; // root of traversed subtree
    /**
     * The stack the maintains the state of the iterator.
     * Elements of the stack are nodes whose descendants are still being
     * considered.
     */
    protected Stack<BinaryTree<E>> todo;  // stack of nodes
    // whose descendants are currently being visited

    /**
     * Construct an iterator to traverse subtree rooted at root
     * in post-order.
     *
     * @post constructs an iterator to traverse in postorder
     * 
     * @param root The root of the subtree to be traversed.
     */
    public BTPostorderIterator(BinaryTree<E> root)
    {
        todo = new StackList<BinaryTree<E>>();
        this.root = root;
        reset();
    }   

    /**
     * Reset the iterator to the first node of the traversal.
     *
     * @post Resets the iterator to retraverse
     */
    public void reset()
    {
        todo.clear();
        // stack is empty; push on nodes from root to
        // leftmost descendant
        BinaryTree<E> current = root;
        while (!current.isEmpty()) {
            todo.push(current);
            if (!current.left().isEmpty())
                current = current.left();
            else
                current = current.right();
        }
    }

    /**
     * Return true iff more nodes are to be considered in traversal.
     *
     * @post Returns true iff iterator is not finished
     * 
     * @return True iff more nodes are to be considered in traversal.
     */
    public boolean hasNext()
    {
        return !todo.isEmpty();
    }

    /**
     * Return the value of the current node.
     *
     * @pre hasNext()
     * @post returns reference to current value
     * 
     * @return The value referenced by current node.
     */
    public E get()
    {   
        return todo.get().value();
    }

    /**
     * Return current value and increment iterator.
     *
     * @pre hasNext();
     * @post returns current value, increments iterator
     * 
     * @return The value currently considered by iterator, increment.
     */
    public E next()
    {
        BinaryTree<E> current = todo.pop();
        E result = current.value();
        if (!todo.isEmpty())
        {
            BinaryTree<E> parent = todo.get();
            if (current == parent.left()) {
                current = parent.right();
                while (!current.isEmpty())
                {
                    todo.push(current);
                    if (!current.left().isEmpty())
                         current = current.left();
                    else current = current.right();
                }
            }
        }
        return result;
    }
}
