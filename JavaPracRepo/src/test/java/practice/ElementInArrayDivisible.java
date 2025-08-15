package practice;
import java.util.*;
public class ElementInArrayDivisible {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[5];
		
		for(int i=0;i<a.length; i++)
		{
			System.out.println("Enter a number:");
			a[i]= sc.nextInt();
		}
		
		for(int j: a)
		{
			if(j%6==0)
			{
				System.out.println("The number is divisible by 6: " + j);
			}
		}

	}

}
