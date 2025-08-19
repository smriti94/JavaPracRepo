package ModulePractice;
import java.util.*;
public class Module8Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number till you want to check: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%3==0)
			{
				System.out.println("The number is divisible by 3: " + i);
			}
			else
			{
				System.out.println("The number is not divisible by 3: " + i);
			}
		}

	}

}
