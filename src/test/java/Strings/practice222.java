package Strings;

import java.util.LinkedHashSet;

public class practice222 {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set =new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character s2:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				
				if(s2==s.charAt(i))
				{
					System.out.println(s2+ " present  "+(i)+" position");
		
			}
		}
}
	}
}