package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.hamcrest.core.CombinableMatcher;

public class CustomizedSorting {
	private String name;

	public CustomizedSorting(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ArrayList<CustomizedSorting> ref = new ArrayList<>();
		ref.add(new CustomizedSorting("Shreyansh"));
		ref.add(new CustomizedSorting("Amit"));
		ref.add(new CustomizedSorting("Amod"));
		ref.add(new CustomizedSorting("Vikram"));
		ref.add(new CustomizedSorting("Sarfaraz"));
		// 1st way
	//	Collections.sort(ref, new CustomizedSorting1());

		// 2nd way by using Anonymous Implementation when needed only once.
		Collections.sort(ref, new Comparator<CustomizedSorting>() {

			@Override
			public int compare(CustomizedSorting o1, CustomizedSorting o2) {
				return -o1.getName().compareTo(o2.getName());
			}
		});
		for (CustomizedSorting temp : ref) {
			System.out.println(temp.getName());
		}
	}

}
