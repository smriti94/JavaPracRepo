package ModulePractice;
import java.util.*;
public class Module18Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a row: ");
		int r= sc.nextInt();
		
		System.out.println("Enter a column: ");
		int c= sc.nextInt();
		
		int a[][]= new int[r][c];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.println("Enter a value: ");
				a[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0; i<a.length; i++)
		{
			int col=1;
			
			System.out.println(a[i][col]);
			
		}
	}

}
