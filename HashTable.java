/**
 * 
 * Jonathan Aguirre, 14349
 * Yosemite Melendez, 14413
 * Delbert Custodio, 14246
 * 
 */

import java.util.HashMap;

public class HashTable implements WordSet 
{
	private HashMap Map = new HashMap<String, Word>();
	public void add(Word wordObject)
	{
		Map.put(wordObject.getWord(), wordObject );
	}

	@Override
	public Word get(Word word) {
		// TODO Auto-generated method stub
		return (Word) Map.get(word.getWord());
	}

}

