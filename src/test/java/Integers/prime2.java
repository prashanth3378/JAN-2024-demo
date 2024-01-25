package Integers;

public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		int count=0;
		for(int i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		System.out.println(i);
		}
		if(count==2)
		{
		System.out.println(i);
		}
		}
	}
}



