package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NaturalSorting implements Comparable<NaturalSorting> {
	private String name;

	public NaturalSorting(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ArrayList<NaturalSorting> ref = new ArrayList<>();
		ref.add(new NaturalSorting("Shreyansh"));
		ref.add(new NaturalSorting("Amit"));
		ref.add(new NaturalSorting("Amod"));
		ref.add(new NaturalSorting("Vikram"));
		ref.add(new NaturalSorting("Sarfaraz"));
		Collections.sort(ref);

	}

	@Override
	public int compareTo(NaturalSorting o) {
		System.out.println(this.getName() + " :  " + o.getName());
		int a = this.getName().compareTo(o.getName());
		System.out.println("a " + a);
		return this.getName().compareTo(o.getName());

	}
}
