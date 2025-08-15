package practice;
import java.util.*;
public class StringPlaindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String s1= sc.nextLine();
		s1=s1.trim().replaceAll("\\s+" , " ").toLowerCase();
		
		String rev="";
		String duplictae=s1;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch= s1.charAt(i);
			rev=ch+rev;
		}
		
		if(rev.equalsIgnoreCase(duplictae))
		{
			System.out.println("The word is Palindrome");
		}
		else
		{
			System.out.println("The word is not a Palindrome");
		}

	}

}
