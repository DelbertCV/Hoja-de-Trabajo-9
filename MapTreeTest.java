import static org.junit.Assert.*;

import org.junit.Test;

public class MapTreeTest {

	@Test
	public void test() {
		MapTree arbol = new MapTree();
		Word a = new Word();
		arbol.add(a); arbol.get(a);
	}

}
