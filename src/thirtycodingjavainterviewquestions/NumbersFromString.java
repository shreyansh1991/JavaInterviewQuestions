package thirtycodingjavainterviewquestions;

public class NumbersFromString {
public static void main(String[] args) {
	String s="sbajbdj1281hfjsahf273";
	String ar[]=s.split("[^\\d]");
	
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}