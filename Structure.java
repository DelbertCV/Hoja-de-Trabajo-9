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


import java.util.Iterator;
import java.util.Collection;

public interface Structure <E>{
    /**
     * Determine the size of the structure.
     *
     * @post computes number of elements contained in structure
     * @return the size of the structure
     */
    public int size();

    /**
     * Determine if there are elements within the structure.
     *
     * @post return true iff the structure is empty
     * @return true if the structure is empty; false otherwise
     */
    public boolean isEmpty();

    /**
     * Removes all elements from the structure.
     *
     * @post the structure is empty
     */
    public void clear();
    
    /**
     * Determines if the structure contains a value.
     *
     * @param value non-null value to be found within structure
     * @pre value is non-null
     * @post returns true iff value.equals some value in structure
     * @return true when some value equals value
     */
    public boolean contains(E value);
    
    /**
     * Inserts value in some structure-specific location.
     *
     * @param value the value to be added to the structure; non-null
     * @pre value is non-null
     * @post value has been added to the structure
     *       replacement policy is not specified
     */
    public void add(E value);

    /**
     * Removes a value from the structure.
     *
     * @param value value matching the value to be removed
     * @pre value is non-null
     * @post an object equal to value is removed and returned, if found
     * @return returns the object that was removed, or null if none
     */
    public Object remove(E value);

    /**
     * Returns an enumeration for traversing the structure.
     *
     * @post returns an enumeration for traversing structure;
     *       all <code>structure</code> package implementations return 
     *       an <code>AbstractIterator</code>
     * @return an enumeration for traversing the structure
     * @see AbstractIterator
     * @see java.util.Iterator
     * @see java.util.Enumeration
     * @see #iterator
     */
    public java.util.Enumeration elements();

    /**
     * Returns an iterator for traversing the structure.
     *
     * @post returns an iterator for traversing structure;
     *       all <code>structure</code> package implementations return 
     *       an <code>AbstractIterator</code>
     * @return an iterator for traversing the structure
     * @see AbstractIterator
     * @see java.util.Iterator
     * @see java.util.Enumeration
     * @see #elements
     */
    public Iterator iterator();

    /**
     * Returns a java.util.Collection wrapping this structure.
     *
     * @post returns a <code>Collection</code> that may be used with
     *       Java's Collection Framework
     * @return a Collection that is equivalent to this structure
     */
    public Collection values();
}