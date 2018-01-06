package thirtycodingjavainterviewquestions;


 class DuplicateCharacterOcurrence
{
	 public static void main(String args[])
	 {
	 String z="";
	 int count=1;
	 String finalString="";
	 String s="cbsjhabhjsavdhvdwsvfdjhwajhfcagwbjhfaskjhf";

	 for(int i=0;i<s.length();i++)
	 {

	 char c=s.charAt(i);
	 for(int j=0;j<s.length();j++)

	 {
	 if(!z.contains(""+c) && s.charAt(i)==(s.charAt(j)) && i!=j)
	 {
	 count++;
	 }

	 }
	 if(count>1)
	 {
	 System.out.println(c+"  "+count);
	 finalString=finalString+c;
	 }
	 else
	 {
		 if(!finalString.contains(""+c))
		 finalString=finalString+c;
	 }
	 z=z+c;
	 count=1;

	 }
	 System.out.println(finalString);
	 }
	 }