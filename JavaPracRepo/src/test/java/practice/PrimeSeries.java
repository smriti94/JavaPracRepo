package practice;
import java.util.*;
public class PrimeSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the initial number:");
		int num1=sc.nextInt();

		System.out.println("Enter the last number:");
		int num2=sc.nextInt();

		for(int i=num1; i<=num2; i++)
		{
			if(i>1) 
			{

				boolean conside_i=true;
				for(int j=2; j<i; j++)
				{
					if(i%j==0)
					{
						conside_i=false;
						break;
					}
				}
				
				if(conside_i==true)
				{
					System.out.println("The number is prime:" + i);
				}

			}

		}

	}

}
