package java8;

import java.util.ArrayList;

public class SortArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 0;
		list.add(789);
		list.add(17854);
		list.add(-61);
		list.add(12636);
		int a[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			a[i] = list.get(i);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;

				}

			}
		}
	
		for (int i = 0; i <a.length; i++) {
			list.remove(i);
			System.out.println(a[i]);
			list.set(i, a[i]);
		}

		//System.out.println(list);
	}

}
