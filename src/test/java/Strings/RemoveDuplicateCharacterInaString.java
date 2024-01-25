package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kannada";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.println(ch);
		}
	}

}
