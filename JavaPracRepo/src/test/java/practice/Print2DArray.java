package practice;

public class Print2DArray {

	public static void main(String[] args) {
		int a[][]= {{2,4}, {5,6}, {8,9}, {1,3}};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
