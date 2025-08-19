package ModulePractice;
import java.util.*;
public class Module17Ques1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]= new int[5];
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter a number: ");
			a[i]=sc.nextInt();
		}
		
		boolean consider_num=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==7)
			{
				consider_num=true;
				break;
			}
		}
		
		if(consider_num==true)
		{
			System.out.println("The number is present");
		}
		else
		{
			System.out.println("The number is not present");
		}
		
	}

}
