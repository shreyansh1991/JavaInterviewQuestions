import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateNumbers {
public static void main(String[] args) {
	int a[]={1,1,1,5,8,9,5,5,7};
	int count=0;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++)
	{
		int c=a[i];
		if(!map.containsKey(c))
		{
			map.put(c,1);
		}
		else
		{
			map.put(c,map.get(c)+1);
		}
	}
	Iterator<Map.Entry<Integer, Integer>> mapValue= map.entrySet().iterator();
	while (mapValue.hasNext()) {
		Map.Entry<Integer,Integer> value= mapValue.next();
		if(value.getValue()>1)
		{
			count++;
			System.out.println(value.getKey() +" "+value.getValue());
		}
		
	}
	System.out.println("no of duplicates element:"+count);
	
}
}
