package javaprogrames;

public class Printnoinascendingorderuseingbubblesort {

	public static void main(String[] args) {
	int[] a= {4,2,1,8};
	for(int i=0;i<a.length;i++)
	{
		for(int j =i+1; j<a.length; j++)
		{
			if(a[i]<a[j]);
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				
			}
			}
		System.out.println(a[i]);
	}
   
	
	
	}
}
				
					
