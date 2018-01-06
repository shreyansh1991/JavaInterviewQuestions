package thirtycodingjavainterviewquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapUsingKey {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println("Before Sorting:");
		Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry mp = it.next();
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
		System.out.println("After Sorting:");

	// FirstMethod - TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
			tmap.putAll(hmap);
		
		Iterator<Map.Entry<Integer, String>> tit = tmap.entrySet().iterator();

		while (tit.hasNext()) {
			Map.Entry mp = tit.next();
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
	}
}
