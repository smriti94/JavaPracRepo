package ModulePractice;
import java.util.*;
public class Module22Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sent= sc.nextLine();
		
		String rev="";
		
		for(int i=0; i<sent.length(); i++)
		{
			char ch= sent.charAt(i);
			rev= ch+rev;
		}
		
		System.out.println(rev);
	}

}
