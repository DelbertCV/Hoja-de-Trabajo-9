/**
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 */

public class SplayTree2 implements WordSet 
{
	private SplayTree<Word>  Arbol = new SplayTree<Word>();
	
	public void add(Word a)
	{
			Arbol.add(a);
	}

	@Override
	public Word get(Word a) {
		// TODO Auto-generated method stub
		return (Word) Arbol.get(a);
	}

}
