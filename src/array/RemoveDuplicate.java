package array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = { 1, 2, 12, 3, 4, 5, 6, 4, 3, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		list.addAll(s);
		// convert list to Integer array
		Integer array[] = list.toArray(new Integer[list.size()]);
		for (int m : array) {
			System.out.println(m);
		}

	}
}
