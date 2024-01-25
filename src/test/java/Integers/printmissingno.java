package Integers;

public class printmissingno {

	public static void main(String[] args) {
int[] a= {1,6,9};
int store=0;
for(int i=1;i<=10;i++)
{
	if(a[store]!=i)

		System.out.println(i);

	else if(store<a.length-1)
	{
		store++;
	}
}



	}

}
