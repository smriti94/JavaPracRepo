package CollectionPractice;
import java.util.*;
import java.util.Map.Entry;
public class HashMapEntrySetPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Jhon");
		hm.put(102, "Smith");
		hm.put(103, "David");
		hm.put(104, "Scott");
		
//		for(Map.Entry entry : hm.entrySet())
//		{
//			System.out.println(entry.getKey()+ "  " + entry.getValue());
//		}

//		Iterator itr = hm.keySet().iterator();
//		while(itr.hasNext())
//		{
//			Integer key = (Integer)itr.next();
//			System.out.println(key +" "+hm .get(key));
			
		Iterator itr = hm.entrySet().iterator();
		{
			while(itr.hasNext())
			{
				Map.Entry entry = (Entry)itr.next();
				System.out.println(entry.getKey() + "  " + entry.getValue());
				
			}
		}
	}

}
