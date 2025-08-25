package CollectionPractice;
import java.util.*;
public class UnionInsertionDifference {

	public static void main(String[] args) {
		HashSet <Integer> set1 = new HashSet <Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		HashSet <Integer> set2 = new HashSet<Integer> ();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		//Union
		
		//set1.addAll(set2);
		
		//System.out.println("Unique Value:" + set1);
		
		//Insertion
		
		//set1.retainAll(set2);
		
		//System.out.println("Common Value:" + set1);
		
		//Difference
		
		//set1.removeAll(set2);
		
		//System.out.println(set1);
	
		//System.out.println(set1.removeAll(set2));
		
		//SubSet
		
		System.out.println(set1.contains(set2));
		
		
		

	}

}
