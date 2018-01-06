package sorting;

public class BubbleSort {
public static void main(String[] args) {
	int a[]={23,43,11,89,66,84,9};
	int temp=0;
	for(int i=1;i<a.length;i++)
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
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
