package java8;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp=0;
		list.add(789);
		list.add(17854);
		list.add(-61);
		list.add(12636);
		Set s=new TreeSet(list);
		System.out.println(s); 
	}
	
}
