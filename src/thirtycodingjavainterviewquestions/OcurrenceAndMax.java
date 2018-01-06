package thirtycodingjavainterviewquestions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OcurrenceAndMax {

public static void main(String[] args) {
	LinkedHashMap<Integer,Integer> l=new LinkedHashMap<Integer,Integer>();
	int a[]={1,2,1,2,3,4,5,6,5,4,3,2,3,4,5,6,76,76,76,76,76,76};
	for(int i=0;i<a.length;i++)
	{
		int j=a[i];
		if(!l.containsKey(j)){
			l.put(j,1);
		}
		else
		{
			l.put(j,l.get(j)+1);
		}
	}
	int max=0,maxKey=0;
	Iterator<Entry<Integer, Integer>> it=l.entrySet().iterator();
	while(it.hasNext())
	{
		
		Map.Entry<Integer,Integer> mapData= it.next();
		if(max<mapData.getValue())
		{
			max=mapData.getValue();
			maxKey=mapData.getKey();
		}
		System.out.println(mapData.getKey() + "  - "+mapData.getValue() +"times");
		
	}
	//System.out.println(max +" : "+maxKey);
}
}
