/*
 * Конспект:
 * Множество в програмировании реализуеться двумя основными способами Hash и Tree.
 * 
 */
package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetMapHash {
	Set s = new HashSet();
	public static void main(String[] args) {
		System.out.println();
		
		Map<String, String> m = System.getenv();
		Set<String> s = m.keySet();
		Iterator<String> i = s.iterator();
		
		while(i.hasNext()){
			String currentKey = i.next();
			String curentValue = m.get(currentKey);
			System.out.println(currentKey + " : " + curentValue);
		}
	}

}
