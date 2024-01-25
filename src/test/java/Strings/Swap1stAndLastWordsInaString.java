package Strings;

public class Swap1stAndLastWordsInaString {

	public static void main(String[] args) {
		String s1="life is short enjoy every moment";
		String[] s = s1.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+ " ");
		}
		
	}

}
