package Strings;

public class vowelsfetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="prashanthio";
int count=0;
for(int i=0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
	count++;
	System.out.println(ch );
//	System.out.println("no of vowels are"+count+" " );
}
}
	}
}
/*else 
{
	
	System.out.println("not vowels");
}
	

}*/
	
