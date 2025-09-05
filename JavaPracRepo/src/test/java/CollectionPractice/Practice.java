package CollectionPractice;
import java.util.*;
import java.util.Map.Entry;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Practice {

	public static void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap();
		
		hm.put(101, "Smith");
		hm.put(102, "Jhon");
		hm.put(103, "David");
		
//		System.out.println(hm);
//		
//		hm.put(102, "Scott");
//		System.out.println(hm);
//		
//		hm.put(104, "Jhon");
//		System.out.println(hm);
//		
//		hm.remove(104);
//		System.out.println(hm);
//		
//		System.out.println(hm.isEmpty());
//		
//		System.out.println(hm.containsKey(102));
//		System.out.println(hm.containsValue("Java"));
//		
//		System.out.println(hm.get(101));
//		System.out.println(hm.size());
		
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());
		
//		for(Object m : hm.keySet())
//		{
//			System.out.println(m + " " + hm.get(m));
//		}
		
//		for(Object a : hm.keySet())
//		{
//			System.out.println(a);
//		}
		
//		for(Map.Entry entry : hm.entrySet())
//		{
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
//		Iterator itr = hm.entrySet().iterator();
//		{
//			
//		while(itr.hasNext())
//		{
//			Map.Entry entry= (Entry)itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//		
//		}
		
		for(Object a: hm.keySet())
		{
			System.out.println(a);
		}
		
		for(Object b : hm.values())
		{
			System.out.println(b);
		}
		
		for(Map.Entry entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		Iterator it = hm.entrySet().iterator();
		{
			while(it.hasNext())
			{
				Map.Entry entry = (Entry)it.next();
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		
		
		
		
		
		

	}

}
