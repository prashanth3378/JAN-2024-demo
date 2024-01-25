package Arrays;

public class FindMaxWithoutBubbleShot {

	public static void main(String[] args) {
		int a[]= {50,80,72,65,54};
		int max=a[0];
		int n=a.length;
		for(int i=0;i<n;i++)
		{
		if(a[i]>max)
		{
		max=a[i];
		}
		}
		System.out.println(max);
		}
	}

