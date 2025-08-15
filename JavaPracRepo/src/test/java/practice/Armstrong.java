package practice;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int temp=num;
		int cube=0;
		int ld=0;
		int sum=0;
		
		while(num!=0)
		{
			ld= num%10;
			cube= ld*ld*ld;
			sum=sum+cube;
			num/=10;
		}
		
		if(sum==temp)
		{
			System.out.println("The number is Palindrome.");
		}
		else
		{
			System.out.println("The number is not a Palindrome");
		}

	}

}
