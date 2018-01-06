package thirtycodingjavainterviewquestions;

public class RemoveSpecialCharacters {
public static void main(String[] args) {
	String req="";
	String s="shrey@!@%^!%@^&!%@ansh791@yahoo.in";
	String a[]=s.split("[^a-zA-Z0-9]");
	for(int i=0;i<a.length;i++)
	{
		req=req+a[i];
	}
	System.out.println(req);
}
}
