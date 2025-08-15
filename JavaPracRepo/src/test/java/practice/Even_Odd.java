package practice;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num1= sc.nextInt();
		
		System.out.println("Enter a number till you want to check:");
		int num2= sc.nextInt();
		
		int odd=0;
		int even=0;
		
		while(num1<=num2)
		{
			if(num1%2==0)
			{
				System.out.println("Number is even" + num1);
				even= even+num1;
				
			}
			else
			{
				System.out.println("Number is ODD:" + num1);
				odd= odd+num1;
			}
			
			num1++;
		}
		
		System.out.println("The sum of even: " + even);
		System.out.println("The sum of odd: " + odd);

	}

}
