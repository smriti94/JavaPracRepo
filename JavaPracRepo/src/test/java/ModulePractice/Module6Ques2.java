package ModulePractice;
import java.util.*;
public class Module6Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a=sc.nextInt();

		System.out.println("Enter a number: ");
		int b=sc.nextInt();

		System.out.println("Enter a number: ");
		int c=sc.nextInt();

		if(a<b)
		{
			if(a<c)
			{
				System.out.println("The minimum value is: " + a);
			}
			else
			{
				System.out.println("The minimum value is: " + c);
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println("The minimum value is: " + b);
			}
			else
			{
				System.out.println("The minimum value is: " + c);
			}
		}

	}

}
