package thirtycodingjavainterviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapByValue {
	public static void main(String[] args) {
		TreeMap tmap = new TreeMap();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 5);
		map.put('b', 99);
		map.put('c', 13);
		map.put('d', 44);
		map.put('e', 50);

		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {

			Map.Entry mapEntry =  it.next();
			tmap.put(mapEntry.getValue(), mapEntry.getKey());

		}
		System.out.println(tmap);
	}
}
