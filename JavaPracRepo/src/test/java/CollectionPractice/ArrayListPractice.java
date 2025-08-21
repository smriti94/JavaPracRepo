package CollectionPractice;
import java.util.*;
public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add(12);
		al.add("Smriti");
		al.add('A');
		al.add(67.56);
		
		System.out.println(al);
		
		ArrayList <Integer> al1= new ArrayList <Integer>();
		
		al1.add(56);
		al1.add(78);
		al1.add(45);
		al1.add(23);
		al1.add(90);
		
		System.out.println(al1);
		System.out.println("The size of the array: " + al.size());
		al.remove(1);
		System.out.println("After remove the element:" + al);
		
		al.add(2, "RImi");
		
		System.out.println(al);
		System.out.println(al1.get(3));
		
		System.out.println(al.set(2, "Smriti")); 
		
		System.out.println(al);
		System.out.println(al.contains(12));
		
		System.out.println(al.isEmpty());
		
		// How to read the data using fort loop
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		//reading the value using for each loop
		
		for(Object a : al1)
		{
			System.out.println(a);
		}
		
		// reading the value using Iterator
		
		Iterator it= al1.iterator() ;
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		al.addAll(al1);
		
		System.out.println(al);
		
		al.removeAll(al1);
		System.out.println(al);
		System.out.println(al1);
		
		String a[]= {"Smriti", "Rimi" , "Prasenjit"};
		
		ArrayList ab= new ArrayList(Arrays.asList(a));
		
		System.out.println("Array to ArrayList" + ab);
		 
		
	}

	
		
	}


