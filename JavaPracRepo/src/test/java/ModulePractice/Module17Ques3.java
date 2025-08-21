package ModulePractice;
import java.util.*;
public class Module17Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the last digit: ");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			int fact=1;
			for(int j=1; j<i+1; j++)
			{
				fact= fact*j;
			}
			a[i]=fact;
		}
		for(int factorial : a)
		
		System.out.println(factorial);

	}

}
