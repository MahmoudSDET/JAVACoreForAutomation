package oop;

public class Constructors_Parent {
	
	protected int x;
	protected int y;
	
	// defult constructor
	public Constructors_Parent() {
		
		
		this.x=0;
		this.y=0;
		
	}
	
	// constructor with parameters
public Constructors_Parent(int a,int b) {
		
		
		this.x=a;
		this.y=b;
		
	}
	
public  int addition()
{
	return x+y;

}

}
