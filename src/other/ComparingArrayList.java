package other;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;

public class ComparingArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("shreyansh");
		list.add("abhishek");
		list.add("aurobinda");
		list.add("sarfaraz");
		//list.add("prabha");

		ArrayList list1 = new ArrayList();
		list1.add("abhishek");
		list1.add("prabha");
		list1.add("sarfaraz");
		list1.add("shreyansh");
		list1.add("aurobinda");
		
		
		/*for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(list1.get(i)))
			{
				System.out.println("Value from first List at index - "+i+" "+list.get(i)+" is matched with value from second list - "+list1.get(i));
			}
			else
			{
				Assert.assertTrue(false, "Value from first List - "+list.get(i)+" is not matched with value from second list - "+list1.get(i));
			}
		}

	}*/
		 for (int counter = 0; counter < list.size(); counter++) {
		        if (list1.contains(list.get(counter))) {
		           // comparingList.set(counter, 1);
		        }
		        else{
		        	Assert.assertTrue(false,"value not found in list "+list.get(counter));		        	
		        }
		        }
		    }
}
