package thirtycodingjavainterviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
public static void main(String[] args) {
	int total=1;
	String s="7asa12bdcsa8dcjsadnjas9nkjmnsadn32";
	Pattern p=Pattern.compile("\\d+");
	Matcher m=p.matcher(s);
	while(m.find())
	{
		int value=Integer.parseInt(m.group());
		total=total*value;
	}
	System.out.println(total);
}
}
