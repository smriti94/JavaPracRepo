package ModulePractice;
import java.util.*;
public class Module18Ques4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number which you want to check the reverse: ");
		int num=sc.nextInt();
		
		int ld;
		int rev=0;
		
		while(num!=0)
		{
			ld= num%10;
			rev= rev*10+ld;
			num/=10;
		}
		
		System.out.println("The reverse number is: " + rev);
	}

}
