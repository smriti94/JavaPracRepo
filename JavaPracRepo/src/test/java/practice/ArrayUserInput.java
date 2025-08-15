package practice;
import java.util.*;
public class ArrayUserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[3];
		
		for(int i=0;i<a.length; i++)
		{
			System.out.println("Enter a number:");
			a[i]= sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("The value of the index " + i +" is: "  + a[i]);
		}

	}

}
