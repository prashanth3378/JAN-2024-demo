package Strings;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primecount=0;
		for(int i=1;i<=100;i++)
		{
			int count=0;
			
		for(int j=1;j<=100;j++)
		{
		if (i%j==0)
		{
			count++;
		}
		}
		if(count==2)
		{
			primecount++;
			
		}
		}
		System.err.println(primecount);
		}

		}
