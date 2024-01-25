package Strings;

public class ToprintVowelsOrConstants {

	static void vowel_or_Consonants(char y)
	{
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
		{
			System.out.println("it is a vowel");
		}
			else
				System.out.println("it is constant");
	}
	
	public static void main(String[] args) {
		ToprintVowelsOrConstants.vowel_or_Consonants('x');
			
	}

	}

