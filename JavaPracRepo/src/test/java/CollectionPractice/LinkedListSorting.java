package CollectionPractice;
import java.util.*;
public class LinkedListSorting {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add('X');
		l.add('Y');
		l.add('Z');
		l.add('A');
		l.add('B');
		l.add('C');
		
		Collections.sort(l);
		
		System.out.println("After sorting: " +l);
		
		Collections.sort(l,Collections.reverseOrder());
		
		System.out.println("After reverse sorting: " + l);
		
		Collections.shuffle(l);
		
		System.out.println("After shuffle : "+ l);
	}

}
