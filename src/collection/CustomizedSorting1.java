package collection;

import java.util.Comparator;

public class CustomizedSorting1  implements Comparator<CustomizedSorting>{

	@Override
	public int compare(CustomizedSorting o1, CustomizedSorting o2) {
		return o1.getName().compareTo(o2.getName());
		
	}

}
