package practice;
import java.util.*;
public class NumberSpCharacterDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email: ");
		String email=sc.nextLine();
		
		String number="";
		String alphabet="";
		String sp_character="";
		
		for(int i=0; i<email.length(); i++)
		{
			char ch= email.charAt(i);
			
			if(Character.isDigit(ch))
			{
				number=number+ch;
			}
			else if(Character.isLetter(ch))
			{
				alphabet=alphabet+ch;
			}
			else
			{
				sp_character=sp_character+ch;
			}
		}
		
		System.out.println(number);
		System.out.println(alphabet);
		System.out.println(sp_character);
		

	}

}
