package practice;
import java.util.*;
public class ChangeUppertoLowerCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sent=sc.nextLine();
		
		String str="";
		char ch_change;
		
		for(int i=0; i<sent.length(); i++)
		{
			char ch=sent.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				ch_change=Character.toUpperCase(ch);
				str=str+ch_change;
			}
			else
			{
				ch_change=Character.toLowerCase(ch);
				str=str+ch_change;
			}
		}
		
		System.out.println(str);
		

	}

}
