package practice;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter a numebr:");
		int num1=sc.nextInt();
		
		System.out.println("Enter a numebr:");
		int num2=sc.nextInt();
		
 		int hcf=0;
		
		for(int i=1; i<((num1>num2)? num1:num2); i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		
		System.out.println("The HCF is:" + hcf);
	}

}
