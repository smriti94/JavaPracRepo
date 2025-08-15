package practice;
import java.util.*;
public class EvenOdd_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[4];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter a number:");
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("The number is even: " + a[i]);
			}
			else
			{
				System.out.println("The number is  Odd: " + a[i]);
			}
		}
			

	}

}
