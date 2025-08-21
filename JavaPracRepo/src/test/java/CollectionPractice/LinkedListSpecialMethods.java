package CollectionPractice;
import java.util.*;
public class LinkedListSpecialMethods {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add(2);
		l.add(4);
		l.add(7);
		l.add(10);
		
		System.out.println("Before adding any data: " + l);
		
		l.addFirst(5);
		l.addLast(11);
		
		System.out.println("After adding first and last value: "+ l);
		
		System.out.println(l.getFirst());
		
		System.out.println(l.getLast());
		
		l.removeFirst();
		
		System.out.println("After remove the first: "+l);
		
		l.removeLast();
		
		System.out.println("After remove the last: "+l);
	}

}
