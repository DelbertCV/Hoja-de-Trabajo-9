/**
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 */

import java.util.TreeMap;

public class MapTree implements WordSet 
{
	private TreeMap Contenido = new TreeMap<String, Word>();
	public void add(Word a)
	{
		Contenido.put(a.getWord(), a );
	}

	@Override
	public Word get(Word word) {
		return (Word) Contenido.get(word.getWord());
	}

}

