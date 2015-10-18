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

import java.util.Comparator;
public class NaturalComparator<E extends Comparable<E>>
implements Comparator<E>
{
public int compare(E a, E b)
// pre: a, b non-null, and b is same type as a
// post: returns value <, ==, > 0 if a <, ==, > b
{
return a.compareTo(b);
}
public boolean equals(Object b)
// post: returns true if b is a NaturalComparator
{
return (b != null) && (b instanceof NaturalComparator);
}
}