package ModulePractice;
import java.util.*;
public class Module20Ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String str= sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}

	}

}
