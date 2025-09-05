package CollectionPractice;
import java.util.*;
public class FrequencyCharacters  // frequesncy of words in a string eg I love you so so much
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your name:");
//		String str= sc.nextLine();
		
		String str= "Prasenjit Sen";
		
		str=str.trim().replaceAll("\\s" , "").toLowerCase();
		
		char ch[]= str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer> ();
		for(char c : ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1 );
			}
			else
			{
				hm.put(c , 1);
			}
		}
		
		----------------------------------------------------------------
		
		//print non-repeating character only
		
		/*for(Character key : hm.keySet())
		{
			if(hm.get(key)<2)
			{
				System.out.println(key + " " + hm.get(key));
			}
		}
		
		/*print repeating character only
		
				for(Character key : hm.keySet())
				{
					if(hm.get(key)>1)
					{
						System.out.println(key +" "+ hm.get(key));
					}
				}*/
		
		
		
		//Print 1st non-repeating character only
//		for(Character key : hm.keySet())
//		{
//			if(hm.get(key)==1)
//			{
//				System.out.println(key +" "+hm.get(key));
//				break;
//			} 
//		}
		
		// print 1st repeating character only
		
//		for(Character key : hm.keySet())
//			{
//				if(hm.get(key)==2)
//				{
//				System.out.println(key + " " + hm.get(key));
//					break;
//				}
//			}		
		//print repeating character only
		// print 1st repeating character only
		//Print 1st non-repeating character only
		
		
		//System.out.println(hm);

	}

}
