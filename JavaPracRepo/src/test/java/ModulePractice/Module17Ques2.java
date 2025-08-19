package ModulePractice;
import java.util.*;
public class Module17Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter a number: ");
			a[i]= sc.nextInt();
		}
		
		for(int value : a)
		{
			if(value%6==0)
			{
				System.out.println("The number is: " + value);
			}
			
		}
		
		//System.out.println("There is no number which can be divisible by 6.");

	}

}
