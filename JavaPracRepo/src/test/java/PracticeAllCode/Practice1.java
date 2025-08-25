package PracticeAllCode;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a sentence:");
		String sent = sc.nextLine();
		
		String num="";
		
		
		for(int i=0; i<sent.length(); i++)
		{
			char ch=sent.charAt(i);
			if(Character.isDigit(ch))
			{
				num=num+ch;
			}
		}
		
		int num1=Integer.valueOf(num);
		int ld;
		int sum=0;
		
		while(num1!=0)
		{
			ld=num1%10;
			sum=sum+ld;
			num1/=10;
		}
		
		System.out.println(sum);
		
		
		
	}
}