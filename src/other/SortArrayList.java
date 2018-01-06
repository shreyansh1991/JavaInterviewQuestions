package other;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("shreyansh");
		list.add("abhishek");
		list.add("aurobinda");
		list.add("sarfaraz");

		Set<String> s = new TreeSet(list);
		System.out.println(s);
	}
}
