package practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		
		int temp= num;
		int rev=0;
		int last_digit=0;
		
		while(num!=0)
		{
			last_digit= num%10;
			rev= rev*10+last_digit;
			num/=10;
		}
		
		if(rev==temp)
		{
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("The number is not a Palindrome");
		}

	}

}
