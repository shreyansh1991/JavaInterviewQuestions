package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicatesInListOtherWay {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		String z = "";
		int count = 0;
		list.add("shreyansh");
		list.add("100");
		list.add("100");
		list.add("arbind");
		list.add("vandana");
		list.add("raj");
		list.add("raj");
		System.out.println("Constructed Array list is- " + list);
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			for (int j = 0; j < list.size(); j++) {

				if (!z.contains(s) && i != j && list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(list.get(i));
			}
			z = z + s;
			count = 0;
		}
	}
}