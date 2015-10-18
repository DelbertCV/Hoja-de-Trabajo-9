public class NodoDoble {
    
	public String Contenido;            
	public String Tipo;        
    public NodoDoble izq, der;   
    public boolean color;
    
    
    public NodoDoble(String palabra, String tipo,boolean color) {
    	this.Tipo   = tipo;
        this.color  = color;
        this.Contenido = palabra;
    }
    
    public String getValor()
	{
    	return Contenido;
	}	
}
