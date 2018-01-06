package array;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayQuestion {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("shreyansh");
		list.add("prabha");
		list.add("pradeep");
		list.add("abhishek");

		LinkedList<String> l = new LinkedList<String>(list);
		for(String m:l)
			System.out.print(m +" ");
	}
}