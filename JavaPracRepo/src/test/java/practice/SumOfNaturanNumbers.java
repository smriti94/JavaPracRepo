package practice;
import java.util.*;
public class SumOfNaturanNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number till you want to check");
		int num2= sc.nextInt();
		int sum=0;
		
		for(int i= num1; i<=num2; i++)
		{
			sum=sum+i;
		}
		
		System.out.println("The sum of the number:" + sum);

	}

}
