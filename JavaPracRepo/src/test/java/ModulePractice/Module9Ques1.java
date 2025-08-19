package ModulePractice;
import java.util.*;
public class Module9Ques1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		int ld=0;
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
		
		System.out.println("The factorial of the number:" + sum);

	}

}
