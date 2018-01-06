package thirtycodingjavainterviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromString2 {
public static void main(String[] args) {
	String s="sbajbdj1281hfjsahf273";
	Pattern p=Pattern.compile("\\d");
	Matcher m=p.matcher(s);
	while(m.find())
	{
		System.out.print(m.group()+"");
	}
}
}