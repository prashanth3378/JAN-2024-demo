package Arrays;

public class FindMinWithoutbubleShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,80,72,65,54};
		int min=a[0];
		int n=a.length;
		for(int i=0;i<n;i++)
		{
		if(a[i]<min)
		{
		min=a[i];
		}
		}
		System.out.println(min);
		}
	}

