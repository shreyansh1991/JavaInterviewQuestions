package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraySubList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Shreyansh");
		list.add("Shreyansh1");
		list.add("Shreyansh2");
		list.add("Shreyansh3");
		list.add("Shreyansh4");
		list.add("Shreyansh5");
		list.add("Shreyansh6");
		list.add("Shreyansh7");
		list.add("Shreyansh8");
		list.add("Shreyansh9");
		list.add("Shreyansh10");
		list.add("Shreyansh11");
		list.add("Shreyansh12");
		
		List subList=list.subList(0, 5);
		System.out.println(subList);
		
	}
}
