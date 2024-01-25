package Integers;

public class Additionofintegersnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="3629"; //output is 20
		String num="";
		int sum=0;  // here we have to give sum zero becoz we hv to count sum of numbers 
		 for(int i=0;i<s.length();i++)
		 {
			
			 if(s.charAt(i)>='0' && s.charAt(i)<='9'
					 )
			 {
				 num=num+s.charAt(i);
			 }
		 }
		char[] ch = num.toCharArray();    //converting character arrray
		for (int x:ch)  //for each loop to fetch each num one by one
		{
			sum=sum+(x-48);  // here 48 is ASCII value of Zero  in x the numbers will be stored  we know 3 ASCII value is 51, 9 ASCII value is 57
			                                                                                        //6 ASCII value is 54 ,2 ASCII value is 50
		}
		System.out.println("sum of all the digits entered is "+sum+" ");
	}

}
