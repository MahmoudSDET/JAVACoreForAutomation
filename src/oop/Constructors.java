package oop;

public class Constructors {
	
	
	// overloading const
	
	Constructors(int a)
	{
		this(); // this here is refering to another contructor has no parameters
		System.out.println("1 param const");
	}
	Constructors()
	{
	//	this(12,9); // this is refering to another constructor has 2 parameters
		System.out.println("default const");
	}
	Constructors(int a,int b)
	{
		this();
		System.out.println("2 param const");
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////
		//Constructors t=new Constructors(10);
		///////////
		//Constructors t1=new Constructors();
		/////
		Constructors t3=new Constructors(5,8);
		
	}

}
