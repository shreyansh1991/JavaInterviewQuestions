package thirtycodingjavainterviewquestions;

public class RemoveDuplicateCharacter{
public static void main(String[] args) {
	String finalString="";
	 String s="cbsjhabhjsavdhvdwsvfdjhwajhfcagwbjhfaskjhf";
	 for(int i=0;i<s.length();i++)
	 {
		 char c=s.charAt(i);
		 if(!finalString.contains(""+c))
			 finalString=finalString+c;
	 }
	 System.out.println(finalString);
}
}
