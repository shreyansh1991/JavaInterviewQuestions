package thirtycodingjavainterviewquestions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HowToRemoveDuplictatesFromSortedArray {
	public static void main(String[] args) {
		int count = 0;
		int k = -1;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap();
		int a[] = { 1, 4, 7, 9, 11, 13, 12, 11, 11, 34, 4 };

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				count++;

			}

		}
		int m = -1;
		int b[] = new int[a.length - count];

		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			m++;

			b[m] = it.next().getKey();

		}

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i]);
		}
	}
}
