package practice;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num>1) {
			
			boolean consider_num_is_prime= true;
			
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					consider_num_is_prime= false;
					break;
				}
			}
			
			if(consider_num_is_prime==true)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}
		else
		{
			System.out.println("Please enter a number which is greater than 1");
		}
		

	}

}
