package practice;
import java.util.*;
public class ReverseStringNotWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String sent = sc.nextLine();
		
		String text[]=sent.split(" ");
		
		
		for(int i=text.length-1; i>=0; i--)
		{
			System.out.print(text[i] + " ");
		}
		
		

	}

}
