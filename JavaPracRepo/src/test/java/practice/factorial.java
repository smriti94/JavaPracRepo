package practice;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for the factorial:");
		int num = sc.nextInt();
		
		int fact=1;
		
		while(num!=0)
		{
			fact= fact*num;
			num--;
			
		}
		
		System.out.println("The factorial of the given number is:" + fact);

	}

}
