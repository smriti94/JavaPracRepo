package practice;
import java.util.*;
public class Practice_COde {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String sent= "My age is 25 years";
		
		String num=sent.replaceAll("[aA-zZ]", "").replaceAll("\\s","");
		
		String alpha=sent.replaceAll("[0-9]", "").replaceAll("\\s"," ");
		
		System.out.println(num);
		System.out.println(alpha);
		
	}	
}
