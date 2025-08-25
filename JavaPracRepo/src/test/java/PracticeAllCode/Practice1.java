package PracticeAllCode;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		
		ArrayList al= new ArrayList();
		
		al.add("Smriti");
		al.add('A');
		al.add(2);
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		al.add(2,"Rimi");
		System.out.println(al.get(1));
		
		System.out.println(al.contains("Python"));
		
		al.set(0,"Prasenjit");
		
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i)); 
		}
		
		for(Object a : al)
		{
			System.out.println(a);
		}
		
		Iterator itr=al.iterator();
		
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		ArrayList al1= new ArrayList();
		
		al1.addAll(al);
		
		System.out.println(al1);
		
		al1.removeAll(al);
		
		System.out.println(al1);
		
		al1.add('X');
		al1.add('Y');
		al1.add('Z');
		al1.add('A');
		al1.add('B');
		al1.add('C');
		
		Collections.sort(al1);;
		
		System.out.println(al1);
		
		Collections.shuffle(al1);
		System.out.println(al1);
		
		Integer arr[]= {1,2,3,4};
		ArrayList b= new ArrayList(Arrays.asList(arr));
		
		for(Object c : b)
		{
			System.out.println(c);
		}
		
		Collections.sort(al1, Collections.reverseOrder());
		System.out.println(al1);
		
		
		
	}
}