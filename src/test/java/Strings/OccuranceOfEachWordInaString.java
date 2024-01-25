package Strings;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInaString {

	private static Object s3;

	public static void main(String[] args) {
	String str="i love love my i country";
	String[] s = str.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<>();
	for(int i=0;i<s.length;i++)
	{
		
		set.add(s[i]);	
	}
	for( Object s1:set)
	{
int	count=0;
for(int i=0;i<s.length;i++)
{
	if(s1.equals(s[i]))
	{
		 count++;
		
	}
}
System.out.print(s1 +"=is present  "+count+" many times");
	//System.out.println(s1 +"=present "+count+" times");
}
}
}
