package Integers;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		int count=0;
		for(int i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		System.out.println("it's prime");
		}
		else
		{
		System.out.println("it's not prime");
		}
	}
}
