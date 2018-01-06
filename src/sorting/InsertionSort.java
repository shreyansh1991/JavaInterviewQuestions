package sorting;

public class InsertionSort {
public static void main(String[] args) {
	
	int a[]={0,2,1,0,3,1,0};
	for(int i=1;i<a.length;i++)
	{
		int key=a[i];
		int j=i-1;
		/*
		 * Move elements of arr[0..i-1], that are greater than key, to one
		 * position ahead of their current position
		 */
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=key;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
