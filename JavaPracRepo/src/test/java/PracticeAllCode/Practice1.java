package PracticeAllCode;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int a[][]= new int[3][5];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter a value: ");
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j]%2 !=0)
				{
					System.out.println("The odd number is: " + a[i][j]);
				}
			}
		}
		
	}
}