package practice;
import java.util.*;
public class StringToIntPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String str= sc.nextLine();
		
		int num=Integer.parseInt(str);
		
		int rev=0;
		int temp=num;
		int ld=0;
		
		while(num!=0)
		{
			ld= num%10;
			num/=10;
			rev=rev*10+ld;
		}
		
		if(rev==temp)
		{
			System.out.println("The number is Palindrome.");
		}
		else
		{
			System.out.println("The number is not a Plaindrome."); 
			
		}

	}

}
