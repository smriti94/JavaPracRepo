package CollectionPractice;
import java.util.*;
public class AddingLinkedList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		
		l.add(12);
		l.add("Smriti");
		l.add(true);
		
		LinkedList l_new = new LinkedList();
		
		l_new.addAll(l);
		
		System.out.println(l_new);
		
		l_new.removeAll(l);
		
		System.out.println("After remove the data: " + l_new);
		
		
		
	}

}
