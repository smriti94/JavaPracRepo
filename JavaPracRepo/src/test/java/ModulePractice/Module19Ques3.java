package ModulePractice;
import java.util.*;
public class Module19Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number till you want to check the prime number: ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			boolean consider_i=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					consider_i=false;
					break;
				}
			}
			
			if(consider_i==true)
			{
				System.out.println("The number is prime:" + i);
			}
			else
			{
				System.out.println("The number is not prime:" + i);
			}
		}

	}

}
