package CollectionPractice;
import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(101, "Jhon");
		hm.put(102, "David");
		hm.put(103, "Scott");
		hm.put(104, "Tye");
		
		System.out.println(hm);

		hm.put(106, "Smith");
		
		System.out.println(hm);
		hm.put(103, "Smriti");
		
		System.out.println(hm);
		
		hm.remove(106);
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(101));
		
		System.out.println(hm.containsValue("Smith"));
		System.out.println(hm.isEmpty());
		
		
		
	}

}
