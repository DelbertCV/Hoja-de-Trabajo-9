import static org.junit.Assert.*;

import org.junit.Test;

public class HashTableTest {

	@Test
	public void test() {
		HashTable arbol = new HashTable();
		Word a = new Word();
		arbol.add(a); arbol.get(a);
	}

}
