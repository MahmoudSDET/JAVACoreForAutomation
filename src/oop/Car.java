package oop;

public class Car  extends Vehicle{
	
	
	public void HondaCity()
	{
		System.out.println("This is Honda City");
	}


	public static void main(String[] args) {
		
		// child
		Car c=new Car();
		c.engine();
		c.horn();
		c.wheels();
		c.HondaCity();
		
		//parent
		Vehicle p=new Vehicle();
		p.engine();
		p.horn();
		p.wheels();
		//p.HondaCity();//
		//
		// Car c=new vehicle();
		Vehicle p1=new Car();
		
		//Vehicle P2=new Car();
		p1.engine();
		p1.horn();
		p1.wheels();
		//p.HondaCity();
		
	//	Car p2=new Vehicle();//Not allowed


	}

}
