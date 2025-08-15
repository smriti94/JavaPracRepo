package practice;

import java.util.Scanner;

public class FactorialsInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("ENter a number: ");
		int num= sc.nextInt();
		
		int a[]= new int[9];
		
		int ld=0;
		int fact=1;
		
		while(num!=0)
		{
			ld=num%10;
			while(ld!=0)
			{
				
				fact=fact*ld;
				for(int i=0; i<a.length; i++)
				{
					a[i]=fact;
				}
				ld--;
			}
			num/=10;
			
		}
		
		//int j=0;
		
		//while(j<a.length)
		//{
			//System.out.println(a[j]);
			//j++;
		//}
		
		System.out.println("The factorial is:" + fact);
	}

}
