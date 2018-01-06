package thirtycodingjavainterviewquestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class HowToRemoveDuplictatesFromSortedArrayUsingArrayList {
	public static void main(String[] args) {

		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		int a[] = { 1, 4, 7, 9, 11, 13, 12, 11, 11, 34, 4 };
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			} else {
				count++;
			}

		}
		int b[]=new int[a.length-count];
		for(int i=0;i<b.length;i++)
		{
			b[i]=list.get(i);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}
}