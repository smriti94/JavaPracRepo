package ModulePractice;
import java.util.*;
public class Module19Ques4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a row: ");
		int r= sc.nextInt();
		
		System.out.println("Enter a row: ");
		int c= sc.nextInt();
		
		int a[][]= new int[r][c];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter a value:");
				a[i][j] = sc.nextInt();
			}
		}
		
		boolean consider_check=false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j]==4)
				{
					consider_check=true;
					break;
				}
			}
		}
		
		if(consider_check==true)
		{
			System.out.println("The value is present.");
		}
		else
		{
			System.out.println("The value is not present.");
		}
	}

}
