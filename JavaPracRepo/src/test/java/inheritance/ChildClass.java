package inheritance;

public class ChildClass extends ParentClass
{
	int age= 30;
	String name = "Smriti Saha";
	String occu = "Engg";
	
	ChildClass()
	{
		
	}
	
	public static void main(String[] args) 
	{
//		System.out.println("I am inside main method");
		
		new ChildClass();
//		ChildClass childClass = new ChildClass();
//		childClass.printAge();
//		childClass.printName();
//		childClass.printOccupation();
//		childClass.printHouseNo();
//		System.out.println(childClass.age);
//		System.out.println(childClass.houseNo);
//		childClass.printParentAge();
//		childClass.printParentname();
		
	}
	
	public void printParentAge()
	{
		System.out.println(super.age);
	}
	
	public void printParentname()
	{
		super.printName();
	}
	public  void printAge()
	{
		System.out.println("Child Age= " + age);
	}
	
	public void printName()
	{
		System.out.println("Child Name= " + name);
	}
	
	public void printOccupation()
	{
		System.out.println("Child occupation= " + occu);
	}

}
