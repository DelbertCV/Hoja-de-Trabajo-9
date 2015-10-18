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

class FailedPostcondition extends FailedAssertion
{
    final static long serialVersionUID = 0L;
    /**
     * Constructs an error indicating failure to meet a postcondition.
     *
     * @post Constructs a new failed postcondition
     * 
     * @param reason String describing postcondition.
     */
    public FailedPostcondition(String reason)
    {
        super("\nA postcondition: " + reason);
    }
}