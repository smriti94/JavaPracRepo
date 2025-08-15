package practice;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int last_digit=0;
		int rev=0;
		
		while(num!=0)
		{
			last_digit= num%10;
			num=num/10;
			rev= rev*10+last_digit;
		}
		
		System.out.println("THe reverse number is: " + rev);

	}

}
