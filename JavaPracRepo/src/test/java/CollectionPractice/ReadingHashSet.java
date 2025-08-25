package CollectionPractice;
import java.util.*;
public class ReadingHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("Smriti");
		hs.add(56);
		hs.add(12.5);
		hs.add('A');
		
		for(Object a : hs)
		{
			System.out.println("I am for each loop: " + a);
		}
		
		Iterator itr= hs.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println("I am iterator: " + itr.next());
			}
		}
		

	}

}
