



/**
 *
 * @author Jose
 */
public class Nodo {
    
	public String Contenido;            
    public String tipo;        
    public Nodo izq, der;   

    public Nodo(String palabra, String tipo) {
            this.tipo   = tipo;
            this.Contenido = palabra;
        }
		 public String getValor()
		{
		return Contenido;
		}	
		 
		
    }

