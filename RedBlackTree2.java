/**
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 */

public class RedBlackTree2 implements WordSet 
{
	private RedBlackBST<String, Word> Arbol = new RedBlackBST<String,Word>();
	public void add(Word a)
	{
			Arbol.put(a.getWord(),a);
	}

	@Override
	public Word get(Word a) {
		
		return (Word) Arbol.get(a.getWord());
	}

}
