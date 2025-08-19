package ModulePractice;
import java.util.*;
public class Module5Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		
		String result= (a%2==0)? "even": "odd";
		
		System.out.println(result );

	}

}
