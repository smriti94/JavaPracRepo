package polymorphism;

//happens in the same class
// method/action name should be same
// parameters should be different(on basis of sequence, datatype, number)
// over loaded methods can have different return types
//(but same method with same parameter but different return type is not method-overloading)
// over loaded methods can be static (same methods one static and other non-static is not method-overloading)
public class MethodOverloading // static/compile time/early binding
{
	public static void main(String[] args)
	{
		MethodOverloading methodOverloading = new MethodOverloading();
		//methodOverloading.calculateArea(2);
		methodOverloading.calculateArea(2,9);
	}
	
	public  static void  calculateArea(int a)
	{
		System.out.println("Area of square "+(a*a));
	}
	
	
	public static void calculateArea(int a, int b)
	{
		System.out.println("Area of rectangle "+(a*b));
	}
	
	
	
	

}
