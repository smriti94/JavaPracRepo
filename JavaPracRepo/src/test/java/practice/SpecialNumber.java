package practice;
import java.util.*;
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		
		int temp=num1;
		int sum=0;
		int ld=0;
		
		while(num1!=0)
		{

			ld=num1%10;
			int fact=1;
			
			while(ld!=0)
			{
				fact=fact*ld;
				ld--;
			}
			
			sum=sum+fact;
			num1/=10;
		}
		

		if(sum==temp)
		{
			System.out.println("The number is special.");
		}
		else
		{
			System.out.println("The number is not a special.");
		}	
	}

}
