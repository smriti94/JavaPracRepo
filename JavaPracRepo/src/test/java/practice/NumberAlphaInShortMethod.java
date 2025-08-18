package practice;
import java.util.*;
public class NumberAlphaInShortMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your email: ");
		String email=sc.nextLine();
		
		String num=email.replaceAll("[aA-zZ]", "").replaceAll("\\s", "");
		
		String alpha=email.replaceAll("[0-9]", "").replaceAll("\\s", " ");
		
		System.out.println(num);
		System.out.println(alpha);

	}

}
