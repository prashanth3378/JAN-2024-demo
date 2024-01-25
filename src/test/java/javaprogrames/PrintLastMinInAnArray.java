package javaprogrames;

public class PrintLastMinInAnArray {

	public static void main(String[] args) {
		int[] a= {5,3,2,4};
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;i++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
					
					System.out.println(a[a.length]);
				
			}
		}

	