package ModulePractice;
import java.util.*;
public class Module9Ques4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int ld;
		int temp=num;
		int sum=0;
		
		while(num!=0)
		{
			ld=num%10;
			int fact=1;
			
			while(ld!=0)
			{
				fact=fact*ld;
				ld--;
			}
			
			sum=sum+fact;
			num/=10;
		}

		if(sum==temp)
		{
			System.out.println("The number is a special number.");
		}
		else
		{
			System.out.println("The number is not a special number.");
		}
	}

}
