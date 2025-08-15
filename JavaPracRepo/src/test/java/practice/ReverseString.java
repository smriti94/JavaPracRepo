package practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String s1=sc.nextLine();
		
		String rev="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			rev= ch+rev;
		}
		
		System.out.println(rev);
	}

}
