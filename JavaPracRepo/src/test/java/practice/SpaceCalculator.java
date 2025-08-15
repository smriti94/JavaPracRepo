package practice;

public class SpaceCalculator {

	public static void main(String[] args) {
		String s1="Bitu RImi Sen";
		
		int space=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			
			if(ch==' ')
			{
				space++;
			}
		}
		
		System.out.println("The total space:" + space);
		System.out.println("The total space:" + (space+1));

	}

}
