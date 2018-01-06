package arrayList;

import java.util.ArrayList;

public class TrimToSizeMethodInArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Shreyansh");
		list.add("Shreyansh1");
		list.add("Shreyansh2");
		list.add("Shreyansh3");
		list.add("Shreyansh4");

		
		list.trimToSize();
		
		System.out.println(list);
	}
}
