package thirtycodingjavainterviewquestions;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class DuplicateElementsFromTwoArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 89, 12, 65,22,54,67 };
		int b[] = { 2, 89, 12, 65 ,99,8};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (!map.containsKey(a[i]) && a[i] == b[j]) {
					map.put(a[i], 1);
					break;
				}
			}
		}
		System.out.println("Duplicate elements are below : ");
		Iterator it=map.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}