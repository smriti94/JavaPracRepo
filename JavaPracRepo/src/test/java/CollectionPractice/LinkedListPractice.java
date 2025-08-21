package CollectionPractice;
import java.util.*;
public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add(100);
		l.add("Smriti");
		l.add(15.5);
		l.add(true);
		l.add('A');
		
		System.out.println(l);
		System.out.println(l.size());
		
		l.remove(0);
		System.out.println(l);
		
		l.add(2,"Java");
		System.out.println(l);
		
		System.out.println(l.get(3));
		
		l.set(3,"Rimi");
		
		System.out.println(l);
		
		System.out.println(l.contains("Java"));
		
		System.out.println(l.contains("Python"));
		
		System.out.println("I am checking then linkedlist empty or not: " + l.isEmpty());
		
		
	}

}
