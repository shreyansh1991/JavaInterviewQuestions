
public class RemoveSpecialCharacters {
public static void main(String[] args) {
	String s="ind$%ia is m?y coun?try";
	String finalString="";
	String str[]=s.split(" ");
	for(int j=0;j<str.length;j++)
	{
		String temp=str[j];
		System.out.println("temp - "+temp);
	//	temp=temp.replaceAll("[^\\w]","") +" ";
		finalString=finalString+temp.replaceAll("[^\\w]","") +" ";
	}
	System.out.println(finalString);
}
}
