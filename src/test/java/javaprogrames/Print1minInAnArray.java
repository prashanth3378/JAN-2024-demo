package javaprogrames;

public class Print1minInAnArray {

	public static void main(String[] args) {
		int[] a= {5,3,2,4};
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;i++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println(a[1]);
				
			}
		}

		}
		}
}
	