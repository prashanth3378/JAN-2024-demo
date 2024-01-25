package Strings;

public class segregateaphaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab*c12#3";
		String alpha=" ";
		String num=" ";
		String spec=" ";
		int count=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			 {
				alpha=alpha+s.charAt(i);
				 
				
			 }
			 else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			 {
				 num=num+s.charAt(i);
				 
			 }
			 else
			 {
				 spec=spec+s.charAt(i);
				
			 }
		 }
		 
			System.out.println(alpha+num+spec);
		 }
	}

