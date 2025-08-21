package CollectionPractice;
import java.util.*;
public class ReadingLinkedList {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();

		l.add(12);
		l.add(67.8);
		l.add("Smriti");
		l.add(false);
		l.add('B');

		//Reading using for loop

		for(int i=0; i<l.size(); i++)
		{
			System.out.println("I am forloop : " + l.get(i));
		}

		System.out.println();

		//Reading using for .each Loop

		for(Object a: l)
		{
			System.out.println("I am for eachloop:" + a);
		}

		System.out.println();

		//Reading using Iterator

		Iterator itr= l. iterator();

		while(itr.hasNext())
		{
			System.out.println("I am iterator: " +itr.next());
		}
	}

	
	
}
