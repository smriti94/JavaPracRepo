package practice;

public class TotalNumberofLetter {

	public static void main(String[] args) {
		String s1="Smriti Rimi Sen";
		
		int number_i=0;
		
		for(int i=0; i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='i')
			{
				number_i++;
			}
		}
		
		System.out.println("The total i is:" + number_i);

	}

}
