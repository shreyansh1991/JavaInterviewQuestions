package help;

public class cfghcgh {
public static void main(String[] args) {
	int a[]={102,45,41,48,41,55,96,74,23};
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<a.length;j++)
		{
			if(a[j-1]>a[j])
			{
			temp=a[j-1];
			a[j-1]=a[j];
			a[j]=temp;
			}
		}	
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
