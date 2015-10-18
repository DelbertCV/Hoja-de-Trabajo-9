
import java.util.TreeMap;

public class ArbolMapa implements WordSet {
    TreeMap<String, String> treeMap = new TreeMap<String, String>();
    public boolean valor;
   
    public void add(Word objeto) {
        treeMap.put(objeto.getWord(),objeto.getType());
    }

    public Word get(Word pal) {
        treeMap.containsValue(pal.getWord());
        valor=treeMap.containsKey(pal.getWord());
        if(valor==true){
            Word palabra=new Word();
            palabra.setWord(pal.getWord());
            palabra.setType(treeMap.get(pal.getWord()));
            return palabra;
        }else{
            return null;
        }
      }
}
