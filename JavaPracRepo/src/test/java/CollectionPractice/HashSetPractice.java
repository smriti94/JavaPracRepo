package CollectionPractice;
import java.util.*;
public class HashSetPractice {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		//HashSet <Integer> hs = new HashSet<Integer> ();
		
		//HashSet hs = new HashSet(100);
		
		//HashSet hs = new HashSet(100, (float) 0.90);
		
		hs.add(12);
		hs.add("Smriti");
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		//remove
		
		hs.remove('A');
		
		System.out.println(hs);
		
		System.out.println(hs.contains("Smriti"));
		
		System.out.println(hs.isEmpty());
		
		
		
		
		
		
		

	}

}
