package ModulePractice;
import java.util.*;
public class Module21Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int num= sc.nextInt();
		
		String num1= String.valueOf(num);
		
		String rev="";
		
		for(int i=0; i<num1.length(); i++)
		{
			char ch= num1.charAt(i);
			rev= ch+rev;
		}
		
		System.out.println("The reverse value is:" +  rev);

	}

}
