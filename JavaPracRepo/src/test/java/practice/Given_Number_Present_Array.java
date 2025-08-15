package practice;
import java.util.*;
public class Given_Number_Present_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Please enter a number: ");
			a[i]= sc.nextInt();
		}
		
		boolean given_number=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==7)
			{
				given_number=true;
				break;
			}
		}
		
		if(given_number==true)
		{
			System.out.println("The number is present");
		}
		else
		{
			System.out.println("The number is not present");
		}
		
		
	}

}
