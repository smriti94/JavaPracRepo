package ModulePractice;
import java.util.*;
public class Module8Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int temp=num;
		int rev=0;
		int ld=0;
		
		while(num!=0)
		{
			ld= num%10;
			num/=10;
			rev=rev*10+ld;
		}
		
		if(rev==temp)
		{
			System.out.println("The number is same");
		}
		else
		{
			System.out.println("The number is not same");
		}

	}

}
