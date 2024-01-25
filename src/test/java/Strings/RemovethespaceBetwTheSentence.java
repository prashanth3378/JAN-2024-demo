package Strings;

public class RemovethespaceBetwTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my India";
		String[] str = s.split( " ");
	    for(int i=str.length-1;i>=0;i--)
		{
		 System.out.println(str[i]);	
		}
	}

}
