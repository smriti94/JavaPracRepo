package constructorProg;

public class MyClass 
{

	 //class variables ->> when object of class is created these variables accquire space in heap memory and 
	//those variable are called instance variable/ variable of the particular object
	int a;
	String b;
	static int age;
	
	MyClass(int x, String y,int z)
	{
		a=x;
		b=y;
		age =z;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		MyClass obj1 = new MyClass(10,"apple",30);
		
	//	MyClass obj2 = new MyClass(20,"usd",50);
		obj1.printA();
		System.out.println();
		MyClass obj2 = new MyClass(20,"usd",50);
		obj2.printA();
		
		obj1.printA();
	}

	public void printA()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(age);
	}
}
