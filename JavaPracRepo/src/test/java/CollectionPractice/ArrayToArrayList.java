package CollectionPractice;
import java.util.*;
public class ArrayToArrayList {

	public static void main(String[] args) {
		String ar[]= {"Dog","Cat", "Cow", "Lion"};
		
		ArrayList al= new ArrayList(Arrays.asList(ar));
		
		System.out.println(al);

	}

}
