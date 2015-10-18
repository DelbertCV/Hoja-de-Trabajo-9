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

class BTLevelorderIterator<E> extends AbstractIterator<E>
{
    /**
     * The root of the subtree being traversed.
     */
    protected BinaryTree<E> root; // root of traversed subtree
    /** 
     * Queue of nodes that maintain the state of the iterator.
     */
    protected Queue<BinaryTree<E>> todo;  // queue of unvisited relatives

    /**
     * Construct a new level-order iterator of a tree.
     *
     * @post Constructs an iterator to traverse in level order
     * 
     * @param root The root of the subtree to be traversed.
     */
    public BTLevelorderIterator(BinaryTree<E> root)
    {
        todo = new QueueList<BinaryTree<E>>();
        this.root = root;
        reset();
    }   

    /**
     * Reset iterator to beginning of traversal.
     *
     * @post Resets the iterator to root node
     */
    public void reset()
    {
        todo.clear();
        // empty queue, add root
        if (!root.isEmpty()) todo.enqueue(root);
    }

    /**
     * Return true if more nodes are to be considered.
     *
     * @post Returns true iff iterator is not finished
     * 
     * @return True if more nodes are to be considered.
     */
    public boolean hasNext()
    {
        return !todo.isEmpty();
    }

    /**
     * Returns the value of the currently considered node.
     *
     * @pre hasNext()
     * @post Returns reference to current value
     * 
     * @return The value of the node currently referenced by iterator.
     */
    public E get()
    {   
        return todo.get().value();
    }

    /**
     * Returns currently considered value and increments iterator.
     *
     * @pre hasNext();
     * @post Returns current value, increments iterator
     * 
     * @return Value considered before iterator is incremented.
     */
    public E next()
    {
        BinaryTree<E> current = todo.dequeue();
        E result = current.value();
        if (!current.left().isEmpty())
            todo.enqueue(current.left());
        if (!current.right().isEmpty())
            todo.enqueue(current.right());
        return result;
    }
}

