package CollectionPractice; 
import java.util.*;
public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		String str= sc.nextLine();
		
		str=str.trim().replaceAll("\\s","").toLowerCase();
		
		char ch[]=str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(Character c : ch)
		{
			if(hm.containsKey(c)) 
			{
				hm.put(c , hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		
//		for(Character c : hm.keySet())
//		{
//			if(hm.get(c)<2)
//			{
//				System.out.println(c + " " + hm.get(c));
//			}
//		}
		
		for(Map.Entry <Character, Integer> entry :   hm.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			
		}
		
		
}
}
