package Strings;

public class StringPalyndrome {

	public static void main(String[] args) {
	String s="mom";      //gadag//mom
	String rev= "";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if (rev.equals(s))
	{
		System.out.println("its playndrome");
	}
	else
	{
		System.out.println("not palyndrome");
	}
	}

}
