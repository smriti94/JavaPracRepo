package ModulePractice;

public class Module9Ques5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			boolean prime_check=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					prime_check=false;
					break;
				}
			}
			if(prime_check==true)
			{
				System.out.println("The number is prime:" + i);
			}
			else
			{
				System.out.println("The number is not prime:" + i);
			}
			
		}
		
		
		
		

	}

}
