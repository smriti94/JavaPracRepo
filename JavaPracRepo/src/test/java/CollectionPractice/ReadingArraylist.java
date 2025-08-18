package CollectionPractice;
import java.util.*;
public class ReadingArraylist {

	public static void main(String[] args) {
		List al= new ArrayList();
		
		al.add(12);
		al.add(23);
		al.add(67);
		al.add(89);
		
		//Using for Loop

		for(int i=0; i<al.size();i++)
		{
			System.out.println("I am For Loop: " + al.get(i));
		}
		//Using for each Loop
		
		/*for(Object a : al)
		{
			System.out.println("I am For Each Loop: " + a);
		}*/
		
		// Using Iterator
		
		/*Iterator ir= al.iterator();
		
		while(ir.hasNext())
		{
			System.out.println("I am Iterator:" + ir.next());
			
		}*/
		
	}

}
