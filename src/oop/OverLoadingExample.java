package oop;

public final class OverLoadingExample {

	
	// overloading should be in the same class
	// changes 1.numbers of parameters and data types and retuninng type
	
	// overriding should not be occured on the same class, should be occured class related classes
	
	int age;
	int dataofBirth;
	// overloading constructors
	// default constructor
	public OverLoadingExample()
	
	{
		
		System.out.println("this is constructor");
		
	}
	
	
public  OverLoadingExample(String d,String MOM,String Date)
	
	{
	System.out.println("this is constructor");
		
		
	}
	
	
	// overloading methods
	
	protected int add(int x,int y)
	{
		
		int b=x+y;
		return b;
	}
	
	
	private int add(int x,int y,int z)
	{
		
		int b=x+y+z;
		return b;
	}
	
	public double add(double x,double y,double z)
	{
		
		double b=x+y+z;
		return b;
	}
	
	
	public double add(int x,double y,double z)
	{
		
		double b=x+y+z;
		return b;
	}
	
	public double add(double x,double y)
	{
		
		double b=x+y;
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadingExample add1=new OverLoadingExample();
		int addiontion1=add1.add(5,6);
		int addiontion2=add1.add(5,6,8);
		double addition3=add1.add(5.8, 5.9);
		
		System.out.print(addiontion1);
		

	}

}
