package array;

import java.util.ArrayList;

public class RemoveDuplicate2 {
	
	public static void main(String[] args) {
		int a[] = { 2, 12, 3, 4, 5, 6, 4, 3, 1, 2 };
		 ArrayList<Integer> list = new ArrayList<Integer>();

		boolean status;
		int countDuplicate = 0;
		String storeArrayElements = "";

		for (int i = 0; i < a.length; i++) {
			status=true;
			for (int j = 0; j < a.length; j++) {
				if (!storeArrayElements.contains("" + a[i]) && a[i] == a[j] && i != j) {
					status = false;
					break;
				}
			}

			
			if (status == true){
				list.add(a[i]);
			}
			storeArrayElements = storeArrayElements + a[i];
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		

	}
}