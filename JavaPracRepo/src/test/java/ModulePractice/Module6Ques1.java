package ModulePractice;
import java.util.*;
public class Module6Ques1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char ch=sc.next().charAt(0);
		
		if((ch>='A'&& ch<='Z')|| (ch>='a' && ch<='z'))
		{
			System.out.println("The number is alphabet ");
		}
		else
		{
			System.out.println("The number is not alphabet");
		}

	}

}
