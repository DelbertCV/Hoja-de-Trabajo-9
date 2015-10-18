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
class BTInorderIterator<E> extends AbstractIterator<E>
{
    /**
     * The root of the subtree being traversed.
     */
    protected BinaryTree<E> root;    // root of subtree to be traversed

    /** 
     * Stack of nodes that maintain the state of the iterator.
     */
    protected Stack<BinaryTree<E>> todo; // stack of unvisited ancestors

    /**
     * Construct a new inorder iterator of a tree.
     *
     * @post Constructs an iterator to traverse inorder
     * 
     * @param root The root of the subtree to be traversed.
     */
    public BTInorderIterator(BinaryTree<E> root)
    {
        todo = new StackList<BinaryTree<E>>();
        this.root = root;
        reset();
    }   

    /**
     * Reset the iterator to its initial state.
     *
     * @post Resets the iterator to retraverse
     */
    public void reset()
    {
        todo.clear();
        // stack is empty.  Push on nodes from root to
        // leftmost descendant
        BinaryTree<E> current = root;
        while (!current.isEmpty()) {
            todo.push(current);
            current = current.left();
        }
    }

    /**
     * Returns true iff the iterator has more nodes to be considered.
     *
     * @post Returns true iff iterator is not finished
     * 
     * @return True iff more nodes are to be considered.
     */
    public boolean hasNext()
    {
        return !todo.isEmpty();
    }

    /**
     * Return the node currently being considered.
     *
     * @pre hasNext()
     * @post Returns reference to current value
     * 
     * @return The node currently under consideration.
     */
    public E get()
    {   
        return todo.get().value();
    }

    /**
     * Return current node, and increment iterator.
     *
     * @pre hasNext()
     * @post Returns current value, increments iterator
     * @return The value of the current node, before iterator iterated.
     */
    public E next()
    {
        BinaryTree<E> old = todo.pop();
        E result = old.value();
        // we know this node has no unconsidered left children;
        // if this node has a right child, 
        //   we push the right child and its leftmost descendants:
        // else 
        //   top element of stack is next node to be visited
        if (!old.right().isEmpty()) {
            BinaryTree<E> current = old.right();
            do {
                todo.push(current);
                current = current.left();
            } while (!current.isEmpty());
        }
        return result;
    }
}
