package ModulePractice;
import java.util.*;
public class Module23Ques2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String sent=sc.nextLine();
		
		char ch1;
		String str="";
		
		for(int i=0; i<sent.length(); i++)
		{
			char ch=sent.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch1=Character.toLowerCase(ch);
				str=str+ch1;
			}
			else
			{
				ch1=Character.toUpperCase(ch);
				str=str+ch1;
			}
		}
		
		System.out.println(str);

		
	}

}
