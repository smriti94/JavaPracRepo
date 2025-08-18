package CollectionPractice;
import java.util.*;
public class SortingArrayList {

	public static void main(String[] args) {
		List a=new ArrayList();
		
		a.add("X");
		a.add("Y");
		a.add("Z");
		a.add("A");
		a.add("B");
		a.add("C");
		
		Collections.sort(a);
		
		System.out.println(a);
		
		Collections.sort(a,Collections.reverseOrder());
		
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		
	
		
		
		

	}

}
