package javaprogrames;

public class Print1stMaxInAnArray {

	public static void main(String[] args) {
		int[] a= {5,3,2,4};
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println(a[0]);
				
			}
		}

		}

	}

}
