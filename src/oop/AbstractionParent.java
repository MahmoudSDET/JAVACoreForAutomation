package oop;

public abstract class AbstractionParent {
	 
	protected double width;
	protected double hight;
	
	abstract double calculateArea();//Method without Body
	
	abstract double  calculatecontour(double width,double height);
	
	
  public	void speed()//Method with Body
	{
		System.out.println("Speed is 100km/h");
	}
	
  // default constructor
public  AbstractionParent() {
	
	
	
}
  
	
	// none default constructor
	AbstractionParent(double w,double h)//Constructor
	{
		this.width=w;
	    this.hight=h;
	}


}
