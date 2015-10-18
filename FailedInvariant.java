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


class FailedInvariant extends FailedAssertion
{
    final static long serialVersionUID = 0L;
    /**
     * Constructs an error indicating failure to meet an invariant
     *
     * @post Constructs a new failed invariant error
     * @param reason String describing failed condition.
     */
    public FailedInvariant(String reason)
    {
        super("\nInvariant that failed: " + reason);
    }
}
