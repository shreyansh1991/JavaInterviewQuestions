package thirtycodingjavainterviewquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromString3 {
public static void main(String[] args) {
	String s="sbajbdj1281hfjsahf273";
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(Character.isDigit(c))
{
System.out.print(Character.getNumericValue(c));	
}
}

}
}