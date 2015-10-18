/**
 * Hoja de Trabajo 9
 * 
 * @Boggdan Barrientos 14484
 * @Andre Rodas		   14395
 * @Rudy Garrido	   14366
 */

import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}

