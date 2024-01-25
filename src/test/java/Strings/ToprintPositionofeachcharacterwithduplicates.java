package Strings;

public class ToprintPositionofeachcharacterwithduplicates {

	public static void main(String[] args) {
		
	String s="Tester";
	String s1 = s.toLowerCase();
	for(int i=0;i<s1.length()-1;i++)
	{
	System.out.println(s1.charAt(i)+" is in "+(i+1)+" position");	
	}
	}
}
