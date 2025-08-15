package practice;
import java.util.*;
public class UserInput2DArrayPrint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[][] = new int[3][2];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter a number:");
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
