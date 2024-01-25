package Strings;

import java.util.LinkedHashMap;

public class No_of_auurance {

	public static void main(String[] args)
	{
		String s = "prshanth";
	
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
		char	aa=s.charAt(i);
		
		}
		if(!map.containsKey(s))
		{
			map.put( s.charAt(i), 1);
		}
	}

}
