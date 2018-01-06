package thirtycodingjavainterviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayList {
public static void main(String[] args) {
ArrayList list=new ArrayList();
List newList=new ArrayList();

Set s=new TreeSet();
list.add("shreyansh");
list.add("geetha");
list.add("vandana");
list.add("aurobinda");
list.add("raj");
list.add("bala");
/*Set s1=new TreeSet(list); nice!!
System.out.println(s1);*/
for (int i = 0; i < list.size(); i++) {
	s.add(list.get(i));
}
newList.addAll(s);
//System.out.println(newList+" : "+newList.get(0));

}
}
